package com.sanmu.myXiaoMi.netty.http;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-11-14 19:57
 **/
public class HttpServer {

    public static void main(String[] args) {
        HttpServer server = new HttpServer();
        server.start(8000);
    }

    public void start(int port){
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workGroup = new NioEventLoopGroup();

        try{
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup,workGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            // server端发送的是httpResponse，所以要使用HttpResponseEncoder进行编码
                            socketChannel.pipeline().addLast(
                                    new HttpResponseEncoder());
                            // server端接收到的是httpRequest，所以要使用HttpRequestDecoder进行解码
                            socketChannel.pipeline().addLast(
                                    new HttpRequestDecoder());
                            socketChannel.pipeline().addLast(
                                    new HttpServerHandler());
                        }
                    }).option(ChannelOption.SO_BACKLOG,128).childOption(ChannelOption.SO_KEEPALIVE,true);

            ChannelFuture f = b.bind(port).sync();
            f.channel().closeFuture().sync();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            workGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }
}
