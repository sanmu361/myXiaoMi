package com.sanmu.myXiaoMi.upload;

import com.google.common.base.Splitter;
import com.google.common.collect.Maps;

import java.awt.event.TextEvent;
import java.util.List;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2017-09-10 14:32
 **/
public class StringTest {

    public static void main(String args[]){
        String a = "{ \n" +
                " 16      '.load': 'text/html', \n" +
                " 17      '.123': 'application/vnd.lotus-1-2-3', \n" +
                " 18      '.3ds': 'image/x-3ds', \n" +
                " 19      '.3g2': 'video/3gpp', \n" +
                " 20      '.3ga': 'video/3gpp', \n" +
                " 21      '.3gp': 'video/3gpp', \n" +
                " 22      '.3gpp': 'video/3gpp', \n" +
                " 23      '.602': 'application/x-t602', \n" +
                " 24      '.669': 'audio/x-mod', \n" +
                " 25      '.7z': 'application/x-7z-compressed', \n" +
                " 26      '.a': 'application/x-archive', \n" +
                " 27      '.aac': 'audio/mp4', \n" +
                " 28      '.abw': 'application/x-abiword', \n" +
                " 29      '.abw.crashed': 'application/x-abiword', \n" +
                " 30      '.abw.gz': 'application/x-abiword', \n" +
                " 31      '.ac3': 'audio/ac3', \n" +
                " 32      '.ace': 'application/x-ace', \n" +
                " 33      '.adb': 'text/x-adasrc', \n" +
                " 34      '.ads': 'text/x-adasrc', \n" +
                " 35      '.afm': 'application/x-font-afm', \n" +
                " 36      '.ag': 'image/x-applix-graphics', \n" +
                " 37      '.ai': 'application/illustrator', \n" +
                " 38      '.aif': 'audio/x-aiff', \n" +
                " 39      '.aifc': 'audio/x-aiff', \n" +
                " 40      '.aiff': 'audio/x-aiff', \n" +
                " 41      '.al': 'application/x-perl', \n" +
                " 42      '.alz': 'application/x-alz', \n" +
                " 43      '.amr': 'audio/amr', \n" +
                " 44      '.ani': 'application/x-navi-animation', \n" +
                " 45      '.anim[1-9j]': 'video/x-anim', \n" +
                " 46      '.anx': 'application/annodex', \n" +
                " 47      '.ape': 'audio/x-ape', \n" +
                " 48      '.arj': 'application/x-arj', \n" +
                " 49      '.arw': 'image/x-sony-arw', \n" +
                " 50      '.as': 'application/x-applix-spreadsheet', \n" +
                " 51      '.asc': 'text/plain', \n" +
                " 52      '.asf': 'video/x-ms-asf', \n" +
                " 53      '.asp': 'application/x-asp', \n" +
                " 54      '.ass': 'text/x-ssa', \n" +
                " 55      '.asx': 'audio/x-ms-asx', \n" +
                " 56      '.atom': 'application/atom+xml', \n" +
                " 57      '.au': 'audio/basic', \n" +
                " 58      '.avi': 'video/x-msvideo', \n" +
                " 59      '.aw': 'application/x-applix-word', \n" +
                " 60      '.awb': 'audio/amr-wb', \n" +
                " 61      '.awk': 'application/x-awk', \n" +
                " 62      '.axa': 'audio/annodex', \n" +
                " 63      '.axv': 'video/annodex', \n" +
                " 64      '.bak': 'application/x-trash', \n" +
                " 65      '.bcpio': 'application/x-bcpio', \n" +
                " 66      '.bdf': 'application/x-font-bdf', \n" +
                " 67      '.bib': 'text/x-bibtex', \n" +
                " 68      '.bin': 'application/octet-stream', \n" +
                " 69      '.blend': 'application/x-blender', \n" +
                " 70      '.blender': 'application/x-blender', \n" +
                " 71      '.bmp': 'image/bmp', \n" +
                " 72      '.bz': 'application/x-bzip', \n" +
                " 73      '.bz2': 'application/x-bzip', \n" +
                " 74      '.c': 'text/x-csrc', \n" +
                " 75      '.c++': 'text/x-c++src', \n" +
                " 76      '.cab': 'application/vnd.ms-cab-compressed', \n" +
                " 77      '.cb7': 'application/x-cb7', \n" +
                " 78      '.cbr': 'application/x-cbr', \n" +
                " 79      '.cbt': 'application/x-cbt', \n" +
                " 80      '.cbz': 'application/x-cbz', \n" +
                " 81      '.cc': 'text/x-c++src', \n" +
                " 82      '.cdf': 'application/x-netcdf', \n" +
                " 83      '.cdr': 'application/vnd.corel-draw', \n" +
                " 84      '.cer': 'application/x-x509-ca-cert', \n" +
                " 85      '.cert': 'application/x-x509-ca-cert', \n" +
                " 86      '.cgm': 'image/cgm', \n" +
                " 87      '.chm': 'application/x-chm', \n" +
                " 88      '.chrt': 'application/x-kchart', \n" +
                " 89      '.class': 'application/x-java', \n" +
                " 90      '.cls': 'text/x-tex', \n" +
                " 91      '.cmake': 'text/x-cmake', \n" +
                " 92      '.cpio': 'application/x-cpio', \n" +
                " 93      '.cpio.gz': 'application/x-cpio-compressed', \n" +
                " 94      '.cpp': 'text/x-c++src', \n" +
                " 95      '.cr2': 'image/x-canon-cr2', \n" +
                " 96      '.crt': 'application/x-x509-ca-cert', \n" +
                " 97      '.crw': 'image/x-canon-crw', \n" +
                " 98      '.cs': 'text/x-csharp', \n" +
                " 99      '.csh': 'application/x-csh', \n" +
                "100      '.css': 'text/css', \n" +
                "101      '.cssl': 'text/css', \n" +
                "102      '.csv': 'text/csv', \n" +
                "103      '.cue': 'application/x-cue', \n" +
                "104      '.cur': 'image/x-win-bitmap', \n" +
                "105      '.cxx': 'text/x-c++src', \n" +
                "106      '.d': 'text/x-dsrc', \n" +
                "107      '.dar': 'application/x-dar', \n" +
                "108      '.dbf': 'application/x-dbf', \n" +
                "109      '.dc': 'application/x-dc-rom', \n" +
                "110      '.dcl': 'text/x-dcl', \n" +
                "111      '.dcm': 'application/dicom', \n" +
                "112      '.dcr': 'image/x-kodak-dcr', \n" +
                "113      '.dds': 'image/x-dds', \n" +
                "114      '.deb': 'application/x-deb', \n" +
                "115      '.der': 'application/x-x509-ca-cert', \n" +
                "116      '.desktop': 'application/x-desktop', \n" +
                "117      '.dia': 'application/x-dia-diagram', \n" +
                "118      '.diff': 'text/x-patch', \n" +
                "119      '.divx': 'video/x-msvideo', \n" +
                "120      '.djv': 'image/vnd.djvu', \n" +
                "121      '.djvu': 'image/vnd.djvu', \n" +
                "122      '.dng': 'image/x-adobe-dng', \n" +
                "123      '.doc': 'application/msword', \n" +
                "124      '.docbook': 'application/docbook+xml', \n" +
                "125      '.docm': 'application/vnd.openxmlformats-officedocument.wordprocessingml.document', \n" +
                "126      '.docx': 'application/vnd.openxmlformats-officedocument.wordprocessingml.document', \n" +
                "127      '.dot': 'text/vnd.graphviz', \n" +
                "128      '.dsl': 'text/x-dsl', \n" +
                "129      '.dtd': 'application/xml-dtd', \n" +
                "130      '.dtx': 'text/x-tex', \n" +
                "131      '.dv': 'video/dv', \n" +
                "132      '.dvi': 'application/x-dvi', \n" +
                "133      '.dvi.bz2': 'application/x-bzdvi', \n" +
                "134      '.dvi.gz': 'application/x-gzdvi', \n" +
                "135      '.dwg': 'image/vnd.dwg', \n" +
                "136      '.dxf': 'image/vnd.dxf', \n" +
                "137      '.e': 'text/x-eiffel', \n" +
                "138      '.egon': 'application/x-egon', \n" +
                "139      '.eif': 'text/x-eiffel', \n" +
                "140      '.el': 'text/x-emacs-lisp', \n" +
                "141      '.emf': 'image/x-emf', \n" +
                "142      '.emp': 'application/vnd.emusic-emusic_package', \n" +
                "143      '.ent': 'application/xml-external-parsed-entity', \n" +
                "144      '.eps': 'image/x-eps', \n" +
                "145      '.eps.bz2': 'image/x-bzeps', \n" +
                "146      '.eps.gz': 'image/x-gzeps', \n" +
                "147      '.epsf': 'image/x-eps', \n" +
                "148      '.epsf.bz2': 'image/x-bzeps', \n" +
                "149      '.epsf.gz': 'image/x-gzeps', \n" +
                "150      '.epsi': 'image/x-eps', \n" +
                "151      '.epsi.bz2': 'image/x-bzeps', \n" +
                "152      '.epsi.gz': 'image/x-gzeps', \n" +
                "153      '.epub': 'application/epub+zip', \n" +
                "154      '.erl': 'text/x-erlang', \n" +
                "155      '.es': 'application/ecmascript', \n" +
                "156      '.etheme': 'application/x-e-theme', \n" +
                "157      '.etx': 'text/x-setext', \n" +
                "158      '.exe': 'application/x-ms-dos-executable', \n" +
                "159      '.exr': 'image/x-exr', \n" +
                "160      '.ez': 'application/andrew-inset', \n" +
                "161      '.f': 'text/x-fortran', \n" +
                "162      '.f90': 'text/x-fortran', \n" +
                "163      '.f95': 'text/x-fortran', \n" +
                "164      '.fb2': 'application/x-fictionbook+xml', \n" +
                "165      '.fig': 'image/x-xfig', \n" +
                "166      '.fits': 'image/fits', \n" +
                "167      '.fl': 'application/x-fluid', \n" +
                "168      '.flac': 'audio/x-flac', \n" +
                "169      '.flc': 'video/x-flic', \n" +
                "170      '.fli': 'video/x-flic', \n" +
                "171      '.flv': 'video/x-flv', \n" +
                "172      '.flw': 'application/x-kivio', \n" +
                "173      '.fo': 'text/x-xslfo', \n" +
                "174      '.for': 'text/x-fortran', \n" +
                "175      '.g3': 'image/fax-g3', \n" +
                "176      '.gb': 'application/x-gameboy-rom', \n" +
                "177      '.gba': 'application/x-gba-rom', \n" +
                "178      '.gcrd': 'text/directory', \n" +
                "179      '.ged': 'application/x-gedcom', \n" +
                "180      '.gedcom': 'application/x-gedcom', \n" +
                "181      '.gen': 'application/x-genesis-rom', \n" +
                "182      '.gf': 'application/x-tex-gf', \n" +
                "183      '.gg': 'application/x-sms-rom', \n" +
                "184      '.gif': 'image/gif', \n" +
                "185      '.glade': 'application/x-glade', \n" +
                "186      '.gmo': 'application/x-gettext-translation', \n" +
                "187      '.gnc': 'application/x-gnucash', \n" +
                "188      '.gnd': 'application/gnunet-directory', \n" +
                "189      '.gnucash': 'application/x-gnucash', \n" +
                "190      '.gnumeric': 'application/x-gnumeric', \n" +
                "191      '.gnuplot': 'application/x-gnuplot', \n" +
                "192      '.gp': 'application/x-gnuplot', \n" +
                "193      '.gpg': 'application/pgp-encrypted', \n" +
                "194      '.gplt': 'application/x-gnuplot', \n" +
                "195      '.gra': 'application/x-graphite', \n" +
                "196      '.gsf': 'application/x-font-type1', \n" +
                "197      '.gsm': 'audio/x-gsm', \n" +
                "198      '.gtar': 'application/x-tar', \n" +
                "199      '.gv': 'text/vnd.graphviz', \n" +
                "200      '.gvp': 'text/x-google-video-pointer', \n" +
                "201      '.gz': 'application/x-gzip', \n" +
                "202      '.h': 'text/x-chdr', \n" +
                "203      '.h++': 'text/x-c++hdr', \n" +
                "204      '.hdf': 'application/x-hdf', \n" +
                "205      '.hh': 'text/x-c++hdr', \n" +
                "206      '.hp': 'text/x-c++hdr', \n" +
                "207      '.hpgl': 'application/vnd.hp-hpgl', \n" +
                "208      '.hpp': 'text/x-c++hdr', \n" +
                "209      '.hs': 'text/x-haskell', \n" +
                "210      '.htm': 'text/html', \n" +
                "211      '.html': 'text/html', \n" +
                "212      '.hwp': 'application/x-hwp', \n" +
                "213      '.hwt': 'application/x-hwt', \n" +
                "214      '.hxx': 'text/x-c++hdr', \n" +
                "215      '.ica': 'application/x-ica', \n" +
                "216      '.icb': 'image/x-tga', \n" +
                "217      '.icns': 'image/x-icns', \n" +
                "218      '.ico': 'image/vnd.microsoft.icon', \n" +
                "219      '.ics': 'text/calendar', \n" +
                "220      '.idl': 'text/x-idl', \n" +
                "221      '.ief': 'image/ief', \n" +
                "222      '.iff': 'image/x-iff', \n" +
                "223      '.ilbm': 'image/x-ilbm', \n" +
                "224      '.ime': 'text/x-imelody', \n" +
                "225      '.imy': 'text/x-imelody', \n" +
                "226      '.ins': 'text/x-tex', \n" +
                "227      '.iptables': 'text/x-iptables', \n" +
                "228      '.iso': 'application/x-cd-image', \n" +
                "229      '.iso9660': 'application/x-cd-image', \n" +
                "230      '.it': 'audio/x-it', \n" +
                "231      '.j2k': 'image/jp2', \n" +
                "232      '.jad': 'text/vnd.sun.j2me.app-descriptor', \n" +
                "233      '.jar': 'application/x-java-archive', \n" +
                "234      '.java': 'text/x-java', \n" +
                "235      '.jng': 'image/x-jng', \n" +
                "236      '.jnlp': 'application/x-java-jnlp-file', \n" +
                "237      '.jp2': 'image/jp2', \n" +
                "238      '.jpc': 'image/jp2', \n" +
                "239      '.jpe': 'image/jpeg', \n" +
                "240      '.jpeg': 'image/jpeg', \n" +
                "241      '.jpf': 'image/jp2', \n" +
                "242      '.jpg': 'image/jpeg', \n" +
                "243      '.jpr': 'application/x-jbuilder-project', \n" +
                "244      '.jpx': 'image/jp2', \n" +
                "245      '.js': 'application/javascript', \n" +
                "246      '.json': 'application/json', \n" +
                "247      '.jsonp': 'application/jsonp', \n" +
                "248      '.k25': 'image/x-kodak-k25', \n" +
                "249      '.kar': 'audio/midi', \n" +
                "250      '.karbon': 'application/x-karbon', \n" +
                "251      '.kdc': 'image/x-kodak-kdc', \n" +
                "252      '.kdelnk': 'application/x-desktop', \n" +
                "253      '.kexi': 'application/x-kexiproject-sqlite3', \n" +
                "254      '.kexic': 'application/x-kexi-connectiondata', \n" +
                "255      '.kexis': 'application/x-kexiproject-shortcut', \n" +
                "256      '.kfo': 'application/x-kformula', \n" +
                "257      '.kil': 'application/x-killustrator', \n" +
                "258      '.kino': 'application/smil', \n" +
                "259      '.kml': 'application/vnd.google-earth.kml+xml', \n" +
                "260      '.kmz': 'application/vnd.google-earth.kmz', \n" +
                "261      '.kon': 'application/x-kontour', \n" +
                "262      '.kpm': 'application/x-kpovmodeler', \n" +
                "263      '.kpr': 'application/x-kpresenter', \n" +
                "264      '.kpt': 'application/x-kpresenter', \n" +
                "265      '.kra': 'application/x-krita', \n" +
                "266      '.ksp': 'application/x-kspread', \n" +
                "267      '.kud': 'application/x-kugar', \n" +
                "268      '.kwd': 'application/x-kword', \n" +
                "269      '.kwt': 'application/x-kword', \n" +
                "270      '.la': 'application/x-shared-library-la', \n" +
                "271      '.latex': 'text/x-tex', \n" +
                "272      '.ldif': 'text/x-ldif', \n" +
                "273      '.lha': 'application/x-lha', \n" +
                "274      '.lhs': 'text/x-literate-haskell', \n" +
                "275      '.lhz': 'application/x-lhz', \n" +
                "276      '.log': 'text/x-log', \n" +
                "277      '.ltx': 'text/x-tex', \n" +
                "278      '.lua': 'text/x-lua', \n" +
                "279      '.lwo': 'image/x-lwo', \n" +
                "280      '.lwob': 'image/x-lwo', \n" +
                "281      '.lws': 'image/x-lws', \n" +
                "282      '.ly': 'text/x-lilypond', \n" +
                "283      '.lyx': 'application/x-lyx', \n" +
                "284      '.lz': 'application/x-lzip', \n" +
                "285      '.lzh': 'application/x-lha', \n" +
                "286      '.lzma': 'application/x-lzma', \n" +
                "287      '.lzo': 'application/x-lzop', \n" +
                "288      '.m': 'text/x-matlab', \n" +
                "289      '.m15': 'audio/x-mod', \n" +
                "290      '.m2t': 'video/mpeg', \n" +
                "291      '.m3u': 'audio/x-mpegurl', \n" +
                "292      '.m3u8': 'audio/x-mpegurl', \n" +
                "293      '.m4': 'application/x-m4', \n" +
                "294      '.m4a': 'audio/mp4', \n" +
                "295      '.m4b': 'audio/x-m4b', \n" +
                "296      '.m4v': 'video/mp4', \n" +
                "297      '.mab': 'application/x-markaby', \n" +
                "298      '.man': 'application/x-troff-man', \n" +
                "299      '.mbox': 'application/mbox', \n" +
                "300      '.md': 'application/x-genesis-rom', \n" +
                "301      '.mdb': 'application/vnd.ms-access', \n" +
                "302      '.mdi': 'image/vnd.ms-modi', \n" +
                "303      '.me': 'text/x-troff-me', \n" +
                "304      '.med': 'audio/x-mod', \n" +
                "305      '.metalink': 'application/metalink+xml', \n" +
                "306      '.mgp': 'application/x-magicpoint', \n" +
                "307      '.mid': 'audio/midi', \n" +
                "308      '.midi': 'audio/midi', \n" +
                "309      '.mif': 'application/x-mif', \n" +
                "310      '.minipsf': 'audio/x-minipsf', \n" +
                "311      '.mka': 'audio/x-matroska', \n" +
                "312      '.mkv': 'video/x-matroska', \n" +
                "313      '.ml': 'text/x-ocaml', \n" +
                "314      '.mli': 'text/x-ocaml', \n" +
                "315      '.mm': 'text/x-troff-mm', \n" +
                "316      '.mmf': 'application/x-smaf', \n" +
                "317      '.mml': 'text/mathml', \n" +
                "318      '.mng': 'video/x-mng', \n" +
                "319      '.mo': 'application/x-gettext-translation', \n" +
                "320      '.mo3': 'audio/x-mo3', \n" +
                "321      '.moc': 'text/x-moc', \n" +
                "322      '.mod': 'audio/x-mod', \n" +
                "323      '.mof': 'text/x-mof', \n" +
                "324      '.moov': 'video/quicktime', \n" +
                "325      '.mov': 'video/quicktime', \n" +
                "326      '.movie': 'video/x-sgi-movie', \n" +
                "327      '.mp+': 'audio/x-musepack', \n" +
                "328      '.mp2': 'video/mpeg', \n" +
                "329      '.mp3': 'audio/mpeg', \n" +
                "330      '.mp4': 'video/mp4', \n" +
                "331      '.mpc': 'audio/x-musepack', \n" +
                "332      '.mpe': 'video/mpeg', \n" +
                "333      '.mpeg': 'video/mpeg', \n" +
                "334      '.mpg': 'video/mpeg', \n" +
                "335      '.mpga': 'audio/mpeg', \n" +
                "336      '.mpp': 'audio/x-musepack', \n" +
                "337      '.mrl': 'text/x-mrml', \n" +
                "338      '.mrml': 'text/x-mrml', \n" +
                "339      '.mrw': 'image/x-minolta-mrw', \n" +
                "340      '.ms': 'text/x-troff-ms', \n" +
                "341      '.msi': 'application/x-msi', \n" +
                "342      '.msod': 'image/x-msod', \n" +
                "343      '.msx': 'application/x-msx-rom', \n" +
                "344      '.mtm': 'audio/x-mod', \n" +
                "345      '.mup': 'text/x-mup', \n" +
                "346      '.mxf': 'application/mxf', \n" +
                "347      '.n64': 'application/x-n64-rom', \n" +
                "348      '.nb': 'application/mathematica', \n" +
                "349      '.nc': 'application/x-netcdf', \n" +
                "350      '.nds': 'application/x-nintendo-ds-rom', \n" +
                "351      '.nef': 'image/x-nikon-nef', \n" +
                "352      '.nes': 'application/x-nes-rom', \n" +
                "353      '.nfo': 'text/x-nfo', \n" +
                "354      '.not': 'text/x-mup', \n" +
                "355      '.nsc': 'application/x-netshow-channel', \n" +
                "356      '.nsv': 'video/x-nsv', \n" +
                "357      '.o': 'application/x-object', \n" +
                "358      '.obj': 'application/x-tgif', \n" +
                "359      '.ocl': 'text/x-ocl', \n" +
                "360      '.oda': 'application/oda', \n" +
                "361      '.odb': 'application/vnd.oasis.opendocument.database', \n" +
                "362      '.odc': 'application/vnd.oasis.opendocument.chart', \n" +
                "363      '.odf': 'application/vnd.oasis.opendocument.formula', \n" +
                "364      '.odg': 'application/vnd.oasis.opendocument.graphics', \n" +
                "365      '.odi': 'application/vnd.oasis.opendocument.image', \n" +
                "366      '.odm': 'application/vnd.oasis.opendocument.text-master', \n" +
                "367      '.odp': 'application/vnd.oasis.opendocument.presentation', \n" +
                "368      '.ods': 'application/vnd.oasis.opendocument.spreadsheet', \n" +
                "369      '.odt': 'application/vnd.oasis.opendocument.text', \n" +
                "370      '.oga': 'audio/ogg', \n" +
                "371      '.ogg': 'video/x-theora+ogg', \n" +
                "372      '.ogm': 'video/x-ogm+ogg', \n" +
                "373      '.ogv': 'video/ogg', \n" +
                "374      '.ogx': 'application/ogg', \n" +
                "375      '.old': 'application/x-trash', \n" +
                "376      '.oleo': 'application/x-oleo', \n" +
                "377      '.opml': 'text/x-opml+xml', \n" +
                "378      '.ora': 'image/openraster', \n" +
                "379      '.orf': 'image/x-olympus-orf', \n" +
                "380      '.otc': 'application/vnd.oasis.opendocument.chart-template', \n" +
                "381      '.otf': 'application/x-font-otf', \n" +
                "382      '.otg': 'application/vnd.oasis.opendocument.graphics-template', \n" +
                "383      '.oth': 'application/vnd.oasis.opendocument.text-web', \n" +
                "384      '.otp': 'application/vnd.oasis.opendocument.presentation-template', \n" +
                "385      '.ots': 'application/vnd.oasis.opendocument.spreadsheet-template', \n" +
                "386      '.ott': 'application/vnd.oasis.opendocument.text-template', \n" +
                "387      '.owl': 'application/rdf+xml', \n" +
                "388      '.oxt': 'application/vnd.openofficeorg.extension', \n" +
                "389      '.p': 'text/x-pascal', \n" +
                "390      '.p10': 'application/pkcs10', \n" +
                "391      '.p12': 'application/x-pkcs12', \n" +
                "392      '.p7b': 'application/x-pkcs7-certificates', \n" +
                "393      '.p7s': 'application/pkcs7-signature', \n" +
                "394      '.pack': 'application/x-java-pack200', \n" +
                "395      '.pak': 'application/x-pak', \n" +
                "396      '.par2': 'application/x-par2', \n" +
                "397      '.pas': 'text/x-pascal', \n" +
                "398      '.patch': 'text/x-patch', \n" +
                "399      '.pbm': 'image/x-portable-bitmap', \n" +
                "400      '.pcd': 'image/x-photo-cd', \n" +
                "401      '.pcf': 'application/x-cisco-vpn-settings', \n" +
                "402      '.pcf.gz': 'application/x-font-pcf', \n" +
                "403      '.pcf.z': 'application/x-font-pcf', \n" +
                "404      '.pcl': 'application/vnd.hp-pcl', \n" +
                "405      '.pcx': 'image/x-pcx', \n" +
                "406      '.pdb': 'chemical/x-pdb', \n" +
                "407      '.pdc': 'application/x-aportisdoc', \n" +
                "408      '.pdf': 'application/pdf', \n" +
                "409      '.pdf.bz2': 'application/x-bzpdf', \n" +
                "410      '.pdf.gz': 'application/x-gzpdf', \n" +
                "411      '.pef': 'image/x-pentax-pef', \n" +
                "412      '.pem': 'application/x-x509-ca-cert', \n" +
                "413      '.perl': 'application/x-perl', \n" +
                "414      '.pfa': 'application/x-font-type1', \n" +
                "415      '.pfb': 'application/x-font-type1', \n" +
                "416      '.pfx': 'application/x-pkcs12', \n" +
                "417      '.pgm': 'image/x-portable-graymap', \n" +
                "418      '.pgn': 'application/x-chess-pgn', \n" +
                "419      '.pgp': 'application/pgp-encrypted', \n" +
                "420      '.php': 'application/x-php', \n" +
                "421      '.php3': 'application/x-php', \n" +
                "422      '.php4': 'application/x-php', \n" +
                "423      '.pict': 'image/x-pict', \n" +
                "424      '.pict1': 'image/x-pict', \n" +
                "425      '.pict2': 'image/x-pict', \n" +
                "426      '.pickle': 'application/python-pickle', \n" +
                "427      '.pk': 'application/x-tex-pk', \n" +
                "428      '.pkipath': 'application/pkix-pkipath', \n" +
                "429      '.pkr': 'application/pgp-keys', \n" +
                "430      '.pl': 'application/x-perl', \n" +
                "431      '.pla': 'audio/x-iriver-pla', \n" +
                "432      '.pln': 'application/x-planperfect', \n" +
                "433      '.pls': 'audio/x-scpls', \n" +
                "434      '.pm': 'application/x-perl', \n" +
                "435      '.png': 'image/png', \n" +
                "436      '.pnm': 'image/x-portable-anymap', \n" +
                "437      '.pntg': 'image/x-macpaint', \n" +
                "438      '.po': 'text/x-gettext-translation', \n" +
                "439      '.por': 'application/x-spss-por', \n" +
                "440      '.pot': 'text/x-gettext-translation-template', \n" +
                "441      '.ppm': 'image/x-portable-pixmap', \n" +
                "442      '.pps': 'application/vnd.ms-powerpoint', \n" +
                "443      '.ppt': 'application/vnd.ms-powerpoint', \n" +
                "444      '.pptm': 'application/vnd.openxmlformats-officedocument.presentationml.presentation', \n" +
                "445      '.pptx': 'application/vnd.openxmlformats-officedocument.presentationml.presentation', \n" +
                "446      '.ppz': 'application/vnd.ms-powerpoint', \n" +
                "447      '.prc': 'application/x-palm-database', \n" +
                "448      '.ps': 'application/postscript', \n" +
                "449      '.ps.bz2': 'application/x-bzpostscript', \n" +
                "450      '.ps.gz': 'application/x-gzpostscript', \n" +
                "451      '.psd': 'image/vnd.adobe.photoshop', \n" +
                "452      '.psf': 'audio/x-psf', \n" +
                "453      '.psf.gz': 'application/x-gz-font-linux-psf', \n" +
                "454      '.psflib': 'audio/x-psflib', \n" +
                "455      '.psid': 'audio/prs.sid', \n" +
                "456      '.psw': 'application/x-pocket-word', \n" +
                "457      '.pw': 'application/x-pw', \n" +
                "458      '.py': 'text/x-python', \n" +
                "459      '.pyc': 'application/x-python-bytecode', \n" +
                "460      '.pyo': 'application/x-python-bytecode', \n" +
                "461      '.qif': 'image/x-quicktime', \n" +
                "462      '.qt': 'video/quicktime', \n" +
                "463      '.qtif': 'image/x-quicktime', \n" +
                "464      '.qtl': 'application/x-quicktime-media-link', \n" +
                "465      '.qtvr': 'video/quicktime', \n" +
                "466      '.ra': 'audio/vnd.rn-realaudio', \n" +
                "467      '.raf': 'image/x-fuji-raf', \n" +
                "468      '.ram': 'application/ram', \n" +
                "469      '.rar': 'application/x-rar', \n" +
                "470      '.ras': 'image/x-cmu-raster', \n" +
                "471      '.raw': 'image/x-panasonic-raw', \n" +
                "472      '.rax': 'audio/vnd.rn-realaudio', \n" +
                "473      '.rb': 'application/x-ruby', \n" +
                "474      '.rdf': 'application/rdf+xml', \n" +
                "475      '.rdfs': 'application/rdf+xml', \n" +
                "476      '.reg': 'text/x-ms-regedit', \n" +
                "477      '.rej': 'application/x-reject', \n" +
                "478      '.rgb': 'image/x-rgb', \n" +
                "479      '.rle': 'image/rle', \n" +
                "480      '.rm': 'application/vnd.rn-realmedia', \n" +
                "481      '.rmj': 'application/vnd.rn-realmedia', \n" +
                "482      '.rmm': 'application/vnd.rn-realmedia', \n" +
                "483      '.rms': 'application/vnd.rn-realmedia', \n" +
                "484      '.rmvb': 'application/vnd.rn-realmedia', \n" +
                "485      '.rmx': 'application/vnd.rn-realmedia', \n" +
                "486      '.roff': 'text/troff', \n" +
                "487      '.rp': 'image/vnd.rn-realpix', \n" +
                "488      '.rpm': 'application/x-rpm', \n" +
                "489      '.rss': 'application/rss+xml', \n" +
                "490      '.rt': 'text/vnd.rn-realtext', \n" +
                "491      '.rtf': 'application/rtf', \n" +
                "492      '.rtx': 'text/richtext', \n" +
                "493      '.rv': 'video/vnd.rn-realvideo', \n" +
                "494      '.rvx': 'video/vnd.rn-realvideo', \n" +
                "495      '.s3m': 'audio/x-s3m', \n" +
                "496      '.sam': 'application/x-amipro', \n" +
                "497      '.sami': 'application/x-sami', \n" +
                "498      '.sav': 'application/x-spss-sav', \n" +
                "499      '.scm': 'text/x-scheme', \n" +
                "500      '.sda': 'application/vnd.stardivision.draw', \n" +
                "501      '.sdc': 'application/vnd.stardivision.calc', \n" +
                "502      '.sdd': 'application/vnd.stardivision.impress', \n" +
                "503      '.sdp': 'application/sdp', \n" +
                "504      '.sds': 'application/vnd.stardivision.chart', \n" +
                "505      '.sdw': 'application/vnd.stardivision.writer', \n" +
                "506      '.sgf': 'application/x-go-sgf', \n" +
                "507      '.sgi': 'image/x-sgi', \n" +
                "508      '.sgl': 'application/vnd.stardivision.writer', \n" +
                "509      '.sgm': 'text/sgml', \n" +
                "510      '.sgml': 'text/sgml', \n" +
                "511      '.sh': 'application/x-shellscript', \n" +
                "512      '.shar': 'application/x-shar', \n" +
                "513      '.shn': 'application/x-shorten', \n" +
                "514      '.siag': 'application/x-siag', \n" +
                "515      '.sid': 'audio/prs.sid', \n" +
                "516      '.sik': 'application/x-trash', \n" +
                "517      '.sis': 'application/vnd.symbian.install', \n" +
                "518      '.sisx': 'x-epoc/x-sisx-app', \n" +
                "519      '.sit': 'application/x-stuffit', \n" +
                "520      '.siv': 'application/sieve', \n" +
                "521      '.sk': 'image/x-skencil', \n" +
                "522      '.sk1': 'image/x-skencil', \n" +
                "523      '.skr': 'application/pgp-keys', \n" +
                "524      '.slk': 'text/spreadsheet', \n" +
                "525      '.smaf': 'application/x-smaf', \n" +
                "526      '.smc': 'application/x-snes-rom', \n" +
                "527      '.smd': 'application/vnd.stardivision.mail', \n" +
                "528      '.smf': 'application/vnd.stardivision.math', \n" +
                "529      '.smi': 'application/x-sami', \n" +
                "530      '.smil': 'application/smil', \n" +
                "531      '.sml': 'application/smil', \n" +
                "532      '.sms': 'application/x-sms-rom', \n" +
                "533      '.snd': 'audio/basic', \n" +
                "534      '.so': 'application/x-sharedlib', \n" +
                "535      '.spc': 'application/x-pkcs7-certificates', \n" +
                "536      '.spd': 'application/x-font-speedo', \n" +
                "537      '.spec': 'text/x-rpm-spec', \n" +
                "538      '.spl': 'application/x-shockwave-flash', \n" +
                "539      '.spx': 'audio/x-speex', \n" +
                "540      '.sql': 'text/x-sql', \n" +
                "541      '.sr2': 'image/x-sony-sr2', \n" +
                "542      '.src': 'application/x-wais-source', \n" +
                "543      '.srf': 'image/x-sony-srf', \n" +
                "544      '.srt': 'application/x-subrip', \n" +
                "545      '.ssa': 'text/x-ssa', \n" +
                "546      '.stc': 'application/vnd.sun.xml.calc.template', \n" +
                "547      '.std': 'application/vnd.sun.xml.draw.template', \n" +
                "548      '.sti': 'application/vnd.sun.xml.impress.template', \n" +
                "549      '.stm': 'audio/x-stm', \n" +
                "550      '.stw': 'application/vnd.sun.xml.writer.template', \n" +
                "551      '.sty': 'text/x-tex', \n" +
                "552      '.sub': 'text/x-subviewer', \n" +
                "553      '.sun': 'image/x-sun-raster', \n" +
                "554      '.sv4cpio': 'application/x-sv4cpio', \n" +
                "555      '.sv4crc': 'application/x-sv4crc', \n" +
                "556      '.svg': 'image/svg+xml', \n" +
                "557      '.svgz': 'image/svg+xml-compressed', \n" +
                "558      '.swf': 'application/x-shockwave-flash', \n" +
                "559      '.sxc': 'application/vnd.sun.xml.calc', \n" +
                "560      '.sxd': 'application/vnd.sun.xml.draw', \n" +
                "561      '.sxg': 'application/vnd.sun.xml.writer.global', \n" +
                "562      '.sxi': 'application/vnd.sun.xml.impress', \n" +
                "563      '.sxm': 'application/vnd.sun.xml.math', \n" +
                "564      '.sxw': 'application/vnd.sun.xml.writer', \n" +
                "565      '.sylk': 'text/spreadsheet', \n" +
                "566      '.t': 'text/troff', \n" +
                "567      '.t2t': 'text/x-txt2tags', \n" +
                "568      '.tar': 'application/x-tar', \n" +
                "569      '.tar.bz': 'application/x-bzip-compressed-tar', \n" +
                "570      '.tar.bz2': 'application/x-bzip-compressed-tar', \n" +
                "571      '.tar.gz': 'application/x-compressed-tar', \n" +
                "572      '.tar.lzma': 'application/x-lzma-compressed-tar', \n" +
                "573      '.tar.lzo': 'application/x-tzo', \n" +
                "574      '.tar.xz': 'application/x-xz-compressed-tar', \n" +
                "575      '.tar.z': 'application/x-tarz', \n" +
                "576      '.tbz': 'application/x-bzip-compressed-tar', \n" +
                "577      '.tbz2': 'application/x-bzip-compressed-tar', \n" +
                "578      '.tcl': 'text/x-tcl', \n" +
                "579      '.tex': 'text/x-tex', \n" +
                "580      '.texi': 'text/x-texinfo', \n" +
                "581      '.texinfo': 'text/x-texinfo', \n" +
                "582      '.tga': 'image/x-tga', \n" +
                "583      '.tgz': 'application/x-compressed-tar', \n" +
                "584      '.theme': 'application/x-theme', \n" +
                "585      '.themepack': 'application/x-windows-themepack', \n" +
                "586      '.tif': 'image/tiff', \n" +
                "587      '.tiff': 'image/tiff', \n" +
                "588      '.tk': 'text/x-tcl', \n" +
                "589      '.tlz': 'application/x-lzma-compressed-tar', \n" +
                "590      '.tnef': 'application/vnd.ms-tnef', \n" +
                "591      '.tnf': 'application/vnd.ms-tnef', \n" +
                "592      '.toc': 'application/x-cdrdao-toc', \n" +
                "593      '.torrent': 'application/x-bittorrent', \n" +
                "594      '.tpic': 'image/x-tga', \n" +
                "595      '.tr': 'text/troff', \n" +
                "596      '.ts': 'application/x-linguist', \n" +
                "597      '.tsv': 'text/tab-separated-values', \n" +
                "598      '.tta': 'audio/x-tta', \n" +
                "599      '.ttc': 'application/x-font-ttf', \n" +
                "600      '.ttf': 'application/x-font-ttf', \n" +
                "601      '.ttx': 'application/x-font-ttx', \n" +
                "602      '.txt': 'text/plain', \n" +
                "603      '.txz': 'application/x-xz-compressed-tar', \n" +
                "604      '.tzo': 'application/x-tzo', \n" +
                "605      '.ufraw': 'application/x-ufraw', \n" +
                "606      '.ui': 'application/x-designer', \n" +
                "607      '.uil': 'text/x-uil', \n" +
                "608      '.ult': 'audio/x-mod', \n" +
                "609      '.uni': 'audio/x-mod', \n" +
                "610      '.uri': 'text/x-uri', \n" +
                "611      '.url': 'text/x-uri', \n" +
                "612      '.ustar': 'application/x-ustar', \n" +
                "613      '.vala': 'text/x-vala', \n" +
                "614      '.vapi': 'text/x-vala', \n" +
                "615      '.vcf': 'text/directory', \n" +
                "616      '.vcs': 'text/calendar', \n" +
                "617      '.vct': 'text/directory', \n" +
                "618      '.vda': 'image/x-tga', \n" +
                "619      '.vhd': 'text/x-vhdl', \n" +
                "620      '.vhdl': 'text/x-vhdl', \n" +
                "621      '.viv': 'video/vivo', \n" +
                "622      '.vivo': 'video/vivo', \n" +
                "623      '.vlc': 'audio/x-mpegurl', \n" +
                "624      '.vob': 'video/mpeg', \n" +
                "625      '.voc': 'audio/x-voc', \n" +
                "626      '.vor': 'application/vnd.stardivision.writer', \n" +
                "627      '.vst': 'image/x-tga', \n" +
                "628      '.wav': 'audio/x-wav', \n" +
                "629      '.wax': 'audio/x-ms-asx', \n" +
                "630      '.wb1': 'application/x-quattropro', \n" +
                "631      '.wb2': 'application/x-quattropro', \n" +
                "632      '.wb3': 'application/x-quattropro', \n" +
                "633      '.wbmp': 'image/vnd.wap.wbmp', \n" +
                "634      '.wcm': 'application/vnd.ms-works', \n" +
                "635      '.wdb': 'application/vnd.ms-works', \n" +
                "636      '.webm': 'video/webm', \n" +
                "637      '.wk1': 'application/vnd.lotus-1-2-3', \n" +
                "638      '.wk3': 'application/vnd.lotus-1-2-3', \n" +
                "639      '.wk4': 'application/vnd.lotus-1-2-3', \n" +
                "640      '.wks': 'application/vnd.ms-works', \n" +
                "641      '.wma': 'audio/x-ms-wma', \n" +
                "642      '.wmf': 'image/x-wmf', \n" +
                "643      '.wml': 'text/vnd.wap.wml', \n" +
                "644      '.wmls': 'text/vnd.wap.wmlscript', \n" +
                "645      '.wmv': 'video/x-ms-wmv', \n" +
                "646      '.wmx': 'audio/x-ms-asx', \n" +
                "647      '.wp': 'application/vnd.wordperfect', \n" +
                "648      '.wp4': 'application/vnd.wordperfect', \n" +
                "649      '.wp5': 'application/vnd.wordperfect', \n" +
                "650      '.wp6': 'application/vnd.wordperfect', \n" +
                "651      '.wpd': 'application/vnd.wordperfect', \n" +
                "652      '.wpg': 'application/x-wpg', \n" +
                "653      '.wpl': 'application/vnd.ms-wpl', \n" +
                "654      '.wpp': 'application/vnd.wordperfect', \n" +
                "655      '.wps': 'application/vnd.ms-works', \n" +
                "656      '.wri': 'application/x-mswrite', \n" +
                "657      '.wrl': 'model/vrml', \n" +
                "658      '.wv': 'audio/x-wavpack', \n" +
                "659      '.wvc': 'audio/x-wavpack-correction', \n" +
                "660      '.wvp': 'audio/x-wavpack', \n" +
                "661      '.wvx': 'audio/x-ms-asx', \n" +
                "662      '.x3f': 'image/x-sigma-x3f', \n" +
                "663      '.xac': 'application/x-gnucash', \n" +
                "664      '.xbel': 'application/x-xbel', \n" +
                "665      '.xbl': 'application/xml', \n" +
                "666      '.xbm': 'image/x-xbitmap', \n" +
                "667      '.xcf': 'image/x-xcf', \n" +
                "668      '.xcf.bz2': 'image/x-compressed-xcf', \n" +
                "669      '.xcf.gz': 'image/x-compressed-xcf', \n" +
                "670      '.xhtml': 'application/xhtml+xml', \n" +
                "671      '.xi': 'audio/x-xi', \n" +
                "672      '.xla': 'application/vnd.ms-excel', \n" +
                "673      '.xlc': 'application/vnd.ms-excel', \n" +
                "674      '.xld': 'application/vnd.ms-excel', \n" +
                "675      '.xlf': 'application/x-xliff', \n" +
                "676      '.xliff': 'application/x-xliff', \n" +
                "677      '.xll': 'application/vnd.ms-excel', \n" +
                "678      '.xlm': 'application/vnd.ms-excel', \n" +
                "679      '.xls': 'application/vnd.ms-excel', \n" +
                "680      '.xlsm': 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet', \n" +
                "681      '.xlsx': 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet', \n" +
                "682      '.xlt': 'application/vnd.ms-excel', \n" +
                "683      '.xlw': 'application/vnd.ms-excel', \n" +
                "684      '.xm': 'audio/x-xm', \n" +
                "685      '.xmf': 'audio/x-xmf', \n" +
                "686      '.xmi': 'text/x-xmi', \n" +
                "687      '.xml': 'application/xml', \n" +
                "688      '.xpm': 'image/x-xpixmap', \n" +
                "689      '.xps': 'application/vnd.ms-xpsdocument', \n" +
                "690      '.xsl': 'application/xml', \n" +
                "691      '.xslfo': 'text/x-xslfo', \n" +
                "692      '.xslt': 'application/xml', \n" +
                "693      '.xspf': 'application/xspf+xml', \n" +
                "694      '.xul': 'application/vnd.mozilla.xul+xml', \n" +
                "695      '.xwd': 'image/x-xwindowdump', \n" +
                "696      '.xyz': 'chemical/x-pdb', \n" +
                "697      '.xz': 'application/x-xz', \n" +
                "698      '.w2p': 'application/w2p', \n" +
                "699      '.z': 'application/x-compress', \n" +
                "700      '.zabw': 'application/x-abiword', \n" +
                "701      '.zip': 'application/zip', \n" +
                "702      '.zoo': 'application/x-zoo', \n" +
                "703      } ";
        List<String> list = Splitter.on("\n").omitEmptyStrings().trimResults().splitToList(a);
        String result = "";

        for(String temp : list){
            if(temp.contains("      ")){
                List<String> tempList = Splitter.on("      ").trimResults().omitEmptyStrings().splitToList(temp);
                List<String> keValues = Splitter.on(":").trimResults().omitEmptyStrings().splitToList(tempList.get(1));
                if(keValues.size() == 2){
                    String key = keValues.get(0).replace("'","");
                    String value = keValues.get(1).replace("'","").replace(",","");

                    result += (key  +  ":" + value + "," );
                }
            }
        }
        System.out.println(  Runtime.getRuntime().maxMemory() / 1024 / 1024);
    }
}
