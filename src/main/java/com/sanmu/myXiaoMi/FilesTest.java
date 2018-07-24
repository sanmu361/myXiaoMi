package com.sanmu.myXiaoMi;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-01-02 12:06
 **/
public class FilesTest {
    public static void main(String[] args) throws IOException {
        File newFile = new File("D:\\文档\\josn1.txt");
        List<String> list = Files.readLines(newFile,Charsets.UTF_8);

        String a = "1312\n" +
                "1374\n" +
                "1402\n" +
                "1450\n" +
                "1791\n" +
                "1847\n" +
                "2326\n" +
                "4136\n" +
                "4286\n" +
                "4584\n" +
                "4908\n" +
                "5010\n" +
                "5386\n" +
                "5610\n" +
                "5643\n" +
                "5726\n" +
                "5851\n" +
                "6027\n" +
                "6029\n" +
                "6044\n" +
                "6163\n" +
                "6202\n" +
                "6353\n" +
                "6664\n" +
                "6816\n" +
                "7038\n" +
                "7077\n" +
                "7428\n" +
                "7471\n" +
                "7597\n" +
                "7832\n" +
                "8340\n" +
                "8374\n" +
                "8419\n" +
                "8420\n" +
                "8591\n" +
                "8592\n" +
                "8593\n" +
                "8594\n" +
                "8595\n" +
                "8606\n" +
                "8811\n" +
                "8913\n" +
                "9052\n" +
                "9056\n" +
                "9064\n" +
                "9067\n" +
                "9346\n" +
                "9391\n" +
                "9493\n" +
                "9495\n" +
                "9525\n" +
                "9598\n" +
                "9632\n" +
                "9834\n" +
                "10003\n" +
                "10037\n" +
                "10186\n" +
                "10187\n" +
                "10243\n" +
                "10244\n" +
                "10290\n" +
                "10295\n" +
                "10309\n" +
                "10485\n" +
                "10508\n" +
                "10511\n" +
                "10687\n" +
                "10701\n" +
                "10852\n" +
                "10853\n" +
                "10894\n" +
                "10895\n" +
                "10896\n" +
                "10897\n" +
                "10930\n" +
                "10935\n" +
                "10958\n" +
                "10959\n" +
                "11099\n" +
                "11102\n" +
                "11154\n" +
                "11169\n" +
                "11170\n" +
                "11171\n" +
                "11176\n" +
                "11184\n" +
                "11219\n" +
                "11221\n" +
                "11224\n" +
                "11271\n" +
                "11272\n" +
                "11273\n" +
                "11274\n" +
                "11276\n" +
                "11277\n" +
                "11278\n" +
                "11319\n" +
                "11338\n" +
                "11339\n" +
                "11340\n" +
                "11341\n" +
                "11342\n" +
                "11348\n" +
                "11351\n" +
                "11354\n" +
                "11389\n" +
                "11407\n" +
                "11514\n" +
                "11515\n" +
                "11516\n" +
                "11517\n" +
                "11552\n" +
                "11566\n" +
                "11569\n" +
                "11615\n" +
                "11616\n" +
                "11617\n" +
                "11618\n" +
                "11693\n" +
                "11694\n" +
                "11707\n" +
                "11710\n" +
                "11803\n" +
                "11855\n" +
                "11860\n" +
                "11863\n" +
                "11864\n" +
                "11869\n" +
                "11870\n" +
                "11871\n" +
                "11872\n" +
                "11885\n" +
                "11890\n" +
                "11892\n" +
                "11893\n" +
                "11894\n" +
                "11951\n" +
                "11956\n" +
                "11957\n" +
                "11958\n" +
                "11960\n" +
                "11961\n" +
                "11962\n" +
                "11963\n" +
                "11964\n" +
                "11967\n" +
                "11970\n" +
                "11973\n" +
                "11974\n" +
                "11990\n" +
                "11991\n" +
                "11998\n" +
                "11999\n" +
                "12013\n" +
                "12047\n" +
                "12072\n" +
                "12073\n" +
                "12074\n" +
                "12078\n" +
                "12093\n" +
                "12094\n" +
                "12098\n" +
                "12129\n" +
                "12133\n" +
                "12140\n" +
                "12203\n" +
                "12204\n" +
                "12256\n" +
                "12266\n" +
                "12272\n" +
                "12275\n" +
                "12280\n" +
                "12281\n" +
                "12282\n" +
                "12284\n" +
                "12332\n" +
                "12334\n" +
                "12336\n" +
                "12338\n" +
                "12339\n" +
                "12359\n" +
                "12361\n" +
                "12373\n" +
                "12375\n" +
                "12376\n" +
                "12377\n" +
                "12378\n" +
                "12381\n" +
                "12389\n" +
                "12400\n" +
                "12530\n" +
                "12539\n" +
                "12556\n" +
                "12561\n" +
                "12566\n" +
                "12569\n" +
                "12573\n" +
                "12609\n" +
                "12619\n" +
                "12620\n" +
                "12621\n" +
                "12622\n" +
                "12654\n" +
                "12655\n" +
                "12656\n" +
                "12657\n" +
                "12658\n" +
                "12666\n" +
                "12667\n" +
                "12668\n" +
                "12669\n" +
                "12671\n" +
                "12693\n" +
                "12694\n" +
                "12695\n" +
                "12765\n" +
                "12766\n" +
                "12769\n" +
                "12770\n" +
                "12785\n" +
                "12786\n" +
                "12789\n" +
                "12791\n" +
                "12792\n" +
                "12800\n" +
                "12801\n" +
                "12853\n" +
                "12867\n" +
                "12868\n" +
                "12869\n" +
                "12870\n" +
                "12871\n" +
                "12894\n" +
                "12907\n" +
                "12908\n" +
                "12912\n" +
                "12926\n" +
                "12927\n" +
                "12937\n" +
                "12939\n" +
                "12941\n" +
                "12943\n" +
                "12973\n" +
                "12994\n" +
                "13015\n" +
                "13018\n" +
                "13031\n" +
                "13034\n" +
                "13035\n" +
                "13036\n" +
                "13071\n" +
                "13079\n" +
                "13080\n" +
                "13085\n" +
                "13086\n" +
                "13087\n" +
                "13088\n" +
                "13089\n" +
                "13108\n" +
                "13110\n" +
                "13111\n" +
                "13113\n" +
                "13114\n" +
                "13135\n" +
                "13136\n" +
                "13138\n" +
                "13140\n" +
                "13159\n" +
                "13160\n" +
                "13161\n" +
                "13169\n" +
                "13170\n" +
                "13178\n" +
                "13179\n" +
                "13182\n" +
                "13183\n" +
                "13184\n" +
                "13185\n" +
                "13186\n" +
                "13194\n" +
                "13195\n" +
                "13220\n" +
                "13222\n" +
                "13224\n" +
                "13228\n" +
                "13229\n" +
                "13232\n" +
                "13233\n" +
                "13245\n" +
                "13285\n" +
                "13293\n" +
                "13294\n" +
                "13299\n" +
                "13341\n" +
                "13383\n" +
                "13384\n" +
                "13385\n" +
                "13400\n" +
                "13401\n" +
                "13402\n" +
                "13415\n" +
                "13416\n" +
                "13417\n" +
                "13474\n" +
                "13475\n" +
                "13476\n" +
                "13477\n" +
                "13592\n" +
                "13593\n" +
                "13594\n" +
                "13595\n" +
                "13596\n" +
                "13597\n" +
                "13638\n" +
                "13639\n" +
                "13640\n" +
                "13646\n" +
                "13648\n" +
                "13666\n" +
                "13670\n" +
                "13671\n" +
                "13673\n" +
                "13674\n" +
                "13675\n" +
                "13676\n" +
                "13677\n" +
                "13678\n" +
                "13679\n" +
                "13718\n" +
                "13719\n" +
                "13722\n" +
                "13740\n" +
                "13746\n" +
                "13759\n" +
                "13779\n" +
                "13785\n" +
                "13791\n" +
                "13793\n" +
                "13806\n" +
                "13807\n" +
                "13808\n" +
                "13815\n" +
                "13816\n" +
                "13817\n" +
                "13819\n" +
                "13824\n" +
                "13825\n" +
                "13828\n" +
                "13833\n" +
                "13837\n" +
                "13842\n" +
                "13843\n" +
                "13847\n" +
                "13849\n" +
                "13854\n" +
                "13862\n" +
                "13863\n" +
                "13865\n" +
                "13866\n" +
                "13867\n" +
                "13871\n" +
                "13872\n" +
                "13873\n" +
                "13874\n" +
                "13882\n" +
                "13883\n" +
                "13884\n" +
                "13886\n" +
                "13893\n" +
                "13894\n" +
                "13899\n" +
                "13900\n" +
                "13901\n" +
                "13902\n" +
                "13903\n" +
                "13904\n" +
                "13905\n" +
                "13906\n" +
                "13907\n" +
                "13908\n" +
                "13910\n" +
                "13911\n" +
                "13917\n" +
                "13918\n" +
                "13920\n" +
                "13925\n" +
                "13960\n" +
                "13961\n" +
                "14016\n" +
                "14017\n" +
                "14018\n" +
                "14027\n" +
                "14068\n" +
                "14070\n" +
                "14072\n" +
                "14074\n" +
                "14075\n" +
                "14076\n" +
                "14077\n" +
                "14078\n" +
                "14079\n" +
                "14083\n" +
                "14100\n" +
                "14104\n" +
                "14105\n" +
                "14107\n" +
                "14108\n" +
                "14115\n" +
                "14116\n" +
                "14120\n" +
                "14121\n" +
                "14122\n" +
                "14132\n" +
                "14138\n" +
                "14139\n" +
                "14147\n" +
                "14148\n" +
                "14149\n" +
                "14173\n" +
                "14174\n" +
                "14175\n" +
                "14177\n" +
                "14178\n" +
                "14180\n" +
                "14191\n" +
                "14196\n" +
                "14198\n" +
                "14199\n" +
                "14228\n" +
                "14259\n" +
                "14261\n" +
                "14262\n" +
                "14264\n" +
                "14266\n" +
                "14267\n" +
                "14270\n" +
                "14272\n" +
                "14273\n" +
                "14274\n" +
                "14275\n" +
                "14276\n" +
                "14277\n" +
                "14293\n" +
                "14300\n" +
                "14302\n" +
                "14303\n" +
                "14309\n" +
                "14313\n" +
                "14315\n" +
                "14318\n" +
                "14323\n" +
                "14324\n" +
                "14348\n" +
                "14349\n" +
                "14350\n" +
                "14357\n" +
                "14358\n" +
                "14359\n" +
                "14361\n" +
                "14365\n" +
                "14366\n" +
                "14367\n" +
                "14408\n" +
                "14409\n" +
                "14411\n" +
                "14422\n" +
                "14423\n" +
                "14425\n" +
                "14427\n" +
                "14428\n" +
                "14429\n" +
                "14436\n" +
                "14439\n" +
                "14463\n" +
                "14464\n" +
                "14465\n" +
                "14472\n" +
                "14473\n" +
                "14474\n" +
                "14475\n" +
                "14476\n" +
                "14477\n" +
                "14479\n" +
                "14484\n" +
                "14485\n" +
                "14488\n" +
                "14489\n" +
                "14499\n" +
                "14507\n" +
                "14548\n" +
                "14588\n" +
                "14590\n" +
                "14592\n" +
                "14597\n" +
                "14600\n" +
                "14611\n" +
                "14612\n" +
                "14613\n" +
                "14615\n" +
                "14616\n" +
                "14617\n" +
                "14618\n" +
                "14620\n" +
                "14621\n" +
                "14622\n" +
                "14623\n" +
                "14624\n" +
                "14625\n" +
                "14627\n" +
                "14629\n" +
                "14630\n" +
                "14650\n" +
                "14664\n" +
                "14665\n" +
                "14666\n" +
                "14682\n" +
                "14683\n" +
                "14684\n" +
                "14687\n" +
                "14692\n" +
                "14698\n" +
                "14700\n" +
                "14706\n" +
                "14708\n" +
                "14709\n" +
                "14711\n" +
                "14712\n" +
                "14713\n" +
                "14714\n" +
                "14715\n" +
                "14720\n" +
                "14757\n" +
                "14758\n" +
                "14759\n" +
                "14769\n" +
                "14770\n" +
                "14771\n" +
                "14772\n" +
                "14805\n" +
                "14824\n" +
                "14885\n" +
                "14891\n" +
                "14892\n" +
                "14894\n" +
                "14896\n" +
                "14897\n" +
                "14910\n" +
                "14911\n" +
                "14917\n" +
                "14918\n" +
                "14927\n" +
                "14928\n" +
                "14929\n" +
                "14930\n" +
                "14931\n" +
                "14932\n" +
                "14933\n" +
                "14936\n" +
                "14939\n" +
                "14940\n" +
                "14947\n" +
                "14948\n" +
                "14949\n" +
                "14950\n" +
                "14951\n" +
                "14955\n" +
                "14956\n" +
                "14957\n" +
                "14985\n" +
                "15071\n" +
                "15083\n" +
                "15086\n" +
                "15088\n" +
                "15092\n" +
                "15097\n" +
                "15098\n" +
                "15125\n" +
                "15183\n" +
                "15240\n" +
                "15241\n" +
                "15242\n" +
                "15264\n" +
                "15268\n" +
                "15273\n" +
                "15274\n" +
                "15275\n" +
                "15276\n" +
                "15277\n" +
                "15279\n" +
                "15280\n" +
                "15283\n" +
                "15286\n" +
                "15291\n" +
                "15312\n" +
                "15313\n" +
                "15314\n" +
                "15326\n" +
                "15327\n" +
                "15328\n" +
                "15329\n" +
                "15348\n" +
                "15349\n" +
                "15350\n" +
                "15357\n" +
                "15358\n" +
                "15364\n" +
                "15366\n" +
                "15396\n" +
                "15409\n" +
                "15410\n" +
                "15418\n" +
                "15445\n" +
                "15446\n" +
                "15447\n" +
                "15460\n" +
                "15461\n" +
                "15462\n" +
                "15466\n" +
                "15468\n" +
                "15477\n" +
                "15493\n" +
                "15494\n" +
                "15496\n" +
                "15501\n" +
                "15508\n" +
                "15510\n" +
                "15521\n" +
                "15527\n" +
                "15528\n" +
                "15530\n" +
                "15540\n" +
                "15559\n" +
                "15561\n" +
                "15563\n" +
                "15569\n" +
                "15570\n" +
                "15572\n" +
                "15575\n" +
                "15576\n" +
                "15588\n" +
                "15589\n" +
                "15590\n" +
                "15591\n" +
                "15592\n" +
                "15595\n" +
                "15596\n" +
                "15599\n" +
                "15600\n" +
                "15614\n" +
                "15622\n" +
                "15627\n" +
                "15628\n" +
                "15629\n" +
                "15630\n" +
                "15631\n" +
                "15632\n" +
                "15633\n" +
                "15635\n" +
                "15636\n" +
                "15643\n" +
                "15644\n" +
                "15647\n" +
                "15648\n" +
                "15649\n" +
                "15650\n" +
                "15651\n" +
                "15667\n" +
                "15668\n" +
                "15669\n" +
                "15670\n" +
                "15671\n" +
                "15679\n" +
                "15682\n" +
                "15683\n" +
                "15689\n" +
                "15690\n" +
                "15691\n" +
                "15703\n" +
                "15704\n" +
                "15705\n" +
                "15706\n" +
                "15719\n" +
                "15722\n" +
                "15736\n" +
                "15741\n" +
                "15754\n" +
                "15755\n" +
                "15756\n" +
                "15757\n" +
                "15759\n" +
                "15762\n" +
                "15763\n" +
                "15764\n" +
                "15765\n" +
                "15767\n" +
                "15768\n" +
                "15769\n" +
                "15770\n" +
                "15771\n" +
                "15776\n" +
                "15780\n" +
                "15790\n" +
                "15791\n" +
                "15792\n" +
                "15794\n" +
                "15796\n" +
                "15797\n" +
                "15829\n" +
                "15866\n" +
                "15872\n" +
                "15873\n" +
                "15874\n" +
                "15875\n" +
                "15878\n" +
                "15879\n" +
                "15880\n" +
                "15881\n" +
                "15882\n" +
                "15883\n" +
                "15889\n" +
                "15904\n" +
                "15909\n" +
                "15912\n" +
                "15923\n" +
                "15925\n" +
                "15928\n" +
                "15929\n" +
                "15955\n" +
                "15956\n" +
                "15957\n" +
                "15959\n" +
                "15960\n" +
                "15961\n" +
                "15962\n" +
                "15986\n" +
                "15987\n" +
                "15988\n" +
                "15989\n" +
                "15990\n" +
                "15997\n" +
                "15998\n" +
                "15999\n" +
                "16040\n" +
                "16058\n" +
                "16134\n" +
                "16137\n" +
                "16138\n" +
                "16139\n" +
                "16141\n" +
                "16144\n" +
                "16147\n" +
                "16148\n" +
                "16163\n" +
                "16166\n" +
                "16173\n" +
                "16196\n" +
                "16198\n" +
                "16200\n" +
                "16208\n" +
                "16209\n" +
                "16252\n" +
                "16256\n" +
                "16281\n" +
                "16290\n" +
                "16291\n" +
                "16292\n" +
                "16294\n" +
                "16296\n" +
                "16297\n" +
                "16298\n" +
                "16320\n" +
                "16321\n" +
                "16322\n" +
                "16323\n" +
                "16329\n" +
                "16330\n" +
                "16336\n" +
                "16337\n" +
                "16350\n" +
                "16351\n" +
                "16359\n" +
                "16360\n" +
                "16361\n" +
                "16362\n" +
                "16363\n" +
                "16379\n" +
                "16380\n" +
                "16381\n" +
                "16398\n" +
                "16408\n" +
                "16413\n" +
                "16414\n" +
                "16415\n" +
                "16432\n" +
                "16433\n" +
                "16434\n" +
                "16467\n" +
                "16471\n" +
                "16472\n" +
                "16474\n" +
                "16476\n" +
                "16506\n" +
                "16507\n" +
                "16511\n" +
                "16512\n" +
                "16513\n" +
                "16584\n" +
                "16585\n" +
                "16589\n" +
                "16590\n" +
                "16614\n" +
                "16621\n" +
                "16629\n" +
                "16650\n" +
                "16652\n" +
                "16658\n" +
                "16771\n" +
                "16772\n" +
                "16773\n" +
                "16846\n" +
                "16862\n" +
                "16863\n" +
                "16864\n" +
                "16868\n" +
                "16880\n" +
                "16881\n" +
                "16882\n" +
                "16883\n" +
                "16884\n" +
                "16909\n" +
                "16920\n" +
                "16926\n" +
                "16949\n" +
                "16950\n" +
                "16951\n" +
                "16955\n" +
                "16959\n" +
                "16961\n" +
                "16964\n" +
                "16965\n" +
                "17006\n" +
                "17007\n" +
                "17008\n" +
                "17020\n" +
                "17021\n" +
                "17022\n" +
                "17023\n" +
                "17025\n" +
                "17027\n" +
                "17060\n" +
                "17069\n" +
                "17070\n" +
                "17071\n" +
                "17102\n" +
                "17119\n" +
                "17139\n" +
                "17148\n" +
                "17151\n" +
                "17152\n" +
                "17162\n" +
                "17163\n" +
                "17164\n" +
                "17177\n" +
                "17178\n" +
                "17193\n" +
                "17194\n" +
                "17195\n" +
                "17196\n" +
                "17197\n" +
                "17198\n" +
                "17202\n" +
                "17220\n" +
                "17221\n" +
                "17231\n" +
                "17242\n" +
                "17243\n" +
                "17244\n" +
                "17245\n" +
                "17247\n" +
                "17320\n" +
                "17330\n" +
                "17348\n" +
                "17352\n" +
                "17389\n" +
                "17390\n" +
                "17391\n" +
                "17515\n" +
                "17528\n" +
                "17529\n" +
                "17533\n" +
                "17549\n" +
                "17550\n" +
                "17552\n" +
                "17553\n" +
                "17574\n" +
                "17575\n" +
                "17581\n" +
                "17582\n" +
                "17583\n" +
                "17592\n" +
                "17593\n" +
                "17594\n" +
                "17595\n" +
                "17599\n" +
                "17628\n" +
                "17629\n" +
                "17630\n" +
                "17631\n" +
                "17637\n" +
                "17738\n" +
                "17777\n" +
                "17778\n" +
                "17805\n" +
                "17948\n" +
                "18019\n" +
                "18074\n";

        Set<String> skus = Sets.newHashSet(); skus.addAll(Splitter.on("\n").trimResults().omitEmptyStrings().splitToList(a));



        String jsong = list.get(0);

        Gson gson = new Gson();


        Map<String,Object> map = gson.fromJson(jsong,new TypeToken<Map<String,Object>>(){}.getType());

        List<LinkedTreeMap<String,Object>> dataList = (List<LinkedTreeMap<String,Object>>)map.get("data");
        List<String> data1 = Lists.newArrayList();
        List<String> data2 = Lists.newArrayList();

        Map<String,A> map1 = Maps.newHashMap();

        for(Map<String,Object> temp : dataList){
//            if(StringUtils.isEmpty(String.valueOf(temp.get("cat_name")))){
//                data1.add(String.valueOf(temp.get("goods_id")));
//                continue;
//            }
//            if(StringUtils.isEmpty(String.valueOf(temp.get("type5_name"))) && !"生态链".equals(String.valueOf(temp.get("cat_name")))){
//                data2.add(String.valueOf(temp.get("goods_id")));
//                continue;
//            }

//            if(temp.get("goods_id").equals("17245") || String.valueOf(temp.get("goods_id")).startsWith("17245") || String.valueOf(temp.get("goods_id")).endsWith("17245")){
//                System.out.println(temp.get("goods_id") + "-");
//            }

                map1.put(String.valueOf(temp.get("goods_id")),new A(
                        Long.valueOf(String.valueOf(temp.get("goods_id"))),
                        Long.valueOf(String.valueOf(temp.get("cat_id"))),
                        String.valueOf(String.valueOf(temp.get("cat_name"))),
                        Long.valueOf(String.valueOf(temp.get("type1_id"))),
                        String.valueOf(temp.get("type1_name")),
                        Long.valueOf(String.valueOf(temp.get("type2_id"))),
                        String.valueOf(temp.get("type2_name")),
                        Long.valueOf(String.valueOf(temp.get("type3_id"))),
                        String.valueOf(temp.get("type3_name")),
                        Long.valueOf(String.valueOf(temp.get("type4_id"))),
                        String.valueOf(temp.get("type4_name")),
                        Long.valueOf(String.valueOf(temp.get("type5_id"))),
                        String.valueOf(temp.get("type5_name"))));

        }

//        for(String sku : skus){
//            for(Map<String,Object> temp : dataList){
//
//            }
//        }

//        System.out.println(gson.toJson(map1.values()));
//
//                String text = "%s   %s  %s  %s  %s  %s  %s  %s  %s  %s  %s  %s  %s ";
//
//        List<String> updateS = Lists.newArrayList();
//        for(String key : map1.keySet()){
//            A bean = map1.get(key);
//            updateS.add(String.format(text,bean.getSku(),bean.getType0_id(),bean.getType0_name(),bean.getType1_id(),bean.getType1_name(),bean.getType2_id(),bean.getType2_name(),bean.getType3_id(),bean.getType3_name(),bean.getType4_id(),bean.getType4_name(),bean.getType5_id(),bean.getType5_name()));
//        }
//
//
//        File file = new File("D:\\文档\\Goods1.txt");
//
//        FileOutputStream out = new FileOutputStream(file);
//        for(String updateStr : updateS) {
//            out.write((updateStr + "\r\n").getBytes());
//        }
//        out.close();


        String insert = "insert into `goods_types`(sku,type_level0_id,type_level0_name,type_level1_id,type_level1_name,type_level2_id,type_level2_name,type_level3_id,type_level3_name,type_level4_id,type_level4_name,type_level5_id,type_level5_name) value(%s,%s,\'%s\',%s,\'%s\',%s,\'%s\',%s,\'%s\',%s,\'%s\',%s,\'%s\'); ";

        String update = "UPDATE goods " +
                "SET type_level0_id = %s , " +
                "    type_level0_name = \'%s\'," +
                "    type_level1_id = %s , " +
                "    type_level1_name = \'%s\'," +
                "    type_level2_id = %s," +
                "    type_level2_name = \'%s\'," +
                "    type_level3_id = %s," +
                "    type_level3_name = \'%s\'," +
                "    type_level4_id = %s," +
                "    type_level4_name = \'%s\'," +
                "    type_level5_id = %s," +
                "    type_level5_name = \'%s\'" +
                "    WHERE sku = %s;";

        List<String> updateS = Lists.newArrayList();

        int i = 0;

        int j = 0;
        for(String key : map1.keySet()){
            A bean = map1.get(key);
            if(skus.contains(key)){
                i++;
            }else{
                j++;
                updateS.add(String.format(insert,bean.getSku(),bean.getType0_id(),bean.getType0_name(),bean.getType1_id(),bean.getType1_name(),bean.getType2_id(),bean.getType2_name(),bean.getType3_id(),bean.getType3_name(),bean.getType4_id(),bean.getType4_name(),bean.getType5_id(),bean.getType5_name()));
            }
        }


        System.out.println(i);
        System.out.println(j);

        File file = new File("D:\\文档\\insertGoodsType.txt");

        j = 0;
        FileOutputStream out = new FileOutputStream(file);
        for(String updateStr : updateS) {
            j++;
            out.write((updateStr + "\r\n").getBytes());
        }
        System.out.println(j);
        out.close();

    }

    private static class A{
        long sku;
        long type0_id;
        String type0_name;
        long type1_id;
        String type1_name;
        long type2_id;
        String type2_name;
        long type3_id;
        String type3_name;
        long type4_id;
        String type4_name;
        long type5_id;
        String type5_name;

        public A(long sku,long type0_id, String type0_name, long type1_id, String type1_name, long type2_id, String type2_name, long type3_id, String type3_name, long type4_id, String type4_name, long type5_id, String type5_name) {
            this.sku = sku;
            this.type0_id = type0_id;

            if(type0_id == 0){
                System.out.println(sku + " : " + type0_id + " :" + type0_name + " :");
            }
            this.type0_name = type0_name;
            this.type1_id = type1_id;
            if(type1_id == 0){
                System.out.println(sku + " : " + type1_id + " :" + type1_name + " :");
            }
            this.type1_name = type1_name;
            this.type2_id = type2_id;
            if(type2_id == 0){
                System.out.println(sku + " : " + type2_id + " :" + type2_name + " :");
            }
            this.type2_name = type2_name;
            this.type3_id = type3_id;
            if(type3_id == 0){
                System.out.println(sku + " : " + type3_id + " :" + type3_name + " :");
            }
            this.type3_name = type3_name;
            this.type4_id = type4_id;
            if(type4_id == 0){
                System.out.println(sku + " : " + type4_id + " :" + type4_name + " :");
            }
            this.type4_name = type4_name;
            this.type5_id = type5_id;
            if(type5_id == 0){
                System.out.println(sku + " : " + type5_id + " :" + type5_name + " :");
            }
            this.type5_name = type5_name;
        }

        public long getSku() {
            return sku;
        }

        public void setType0_id(long type0_id) {
            this.type0_id = type0_id;
        }

        public void setType0_name(String type0_name) {
            this.type0_name = type0_name;
        }

        public long getType0_id() {
            return type0_id;
        }

        public String getType0_name() {
            return type0_name;
        }

        public long getType1_id() {
            return type1_id;
        }

        public String getType1_name() {
            return type1_name;
        }

        public long getType2_id() {
            return type2_id;
        }

        public String getType2_name() {
            return type2_name;
        }

        public long getType3_id() {
            return type3_id;
        }

        public String getType3_name() {
            return type3_name;
        }

        public long getType4_id() {
            return type4_id;
        }

        public String getType4_name() {
            return type4_name;
        }

        public long getType5_id() {
            return type5_id;
        }

        public String getType5_name() {
            return type5_name;
        }

        public void setSku(long sku) {
            this.sku = sku;
        }

        public void setType1_id(long type1_id) {
            this.type1_id = type1_id;
        }

        public void setType1_name(String type1_name) {
            this.type1_name = type1_name;
        }

        public void setType2_id(long type2_id) {
            this.type2_id = type2_id;
        }

        public void setType2_name(String type2_name) {
            this.type2_name = type2_name;
        }

        public void setType3_id(long type3_id) {
            this.type3_id = type3_id;
        }

        public void setType3_name(String type3_name) {
            this.type3_name = type3_name;
        }

        public void setType4_id(long type4_id) {
            this.type4_id = type4_id;
        }

        public void setType4_name(String type4_name) {
            this.type4_name = type4_name;
        }

        public void setType5_id(long type5_id) {
            this.type5_id = type5_id;
        }

        public void setType5_name(String type5_name) {
            this.type5_name = type5_name;
        }
    }
}
