package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import androidx.compose.foundation.f;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.g;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import androidx.compose.ui.node.o;
import androidx.compose.ui.node.p;
import androidx.compose.ui.platform.e;
import androidx.compose.ui.platform.l;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class br9 {
    public static go8 a;
    public static final a b = new a(-1571120048, new ty0(), false);
    public static final a c = new a(-1455401925, new yf(6), false);
    public static final float[] d = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] e = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final pz7 f = new pz7();
    public static final qz7 g = new qz7();
    public static final String[] h = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] i = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] j = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static final /* synthetic */ int k = 0;
    public static Method l;
    public static Method m;
    public static boolean n;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;

    public static final void A(t0 t0Var, String str) {
        t0Var.s(t0Var.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static List B(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        js3.o(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List C(Object... objArr) {
        js3.p(objArr, "elements");
        return objArr.length > 0 ? ew.r0(objArr) : EmptyList.a;
    }

    public static final CharSequence D(int i2, CharSequence charSequence) {
        js3.p(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i2 != -1) {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                String str = i3 <= 0 ? "" : ".....";
                String str2 = i4 >= charSequence.length() ? "" : ".....";
                StringBuilder sbC = bl4.C(str);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length = charSequence.length();
                if (i4 > length) {
                    i4 = length;
                }
                sbC.append(charSequence.subSequence(i3, i4).toString());
                sbC.append(str2);
                return sbC.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static ArrayList E(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new kv(objArr, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long F(java.lang.String r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br9.F(java.lang.String, int, int):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void G(gx4 gx4Var, bp2 bp2Var) {
        o oVar = gx4Var.g;
        if (oVar == null) {
            oVar = new o((jr5) gx4Var);
            gx4Var.g = oVar;
        }
        p snapshotObserver = y40.I(gx4Var).getSnapshotObserver();
        snapshotObserver.a.d(oVar, o.b, bp2Var);
    }

    public static hx4 H(hx4 hx4Var, bp2 bp2Var) {
        return hx4Var.d(new et5(bp2Var));
    }

    public static final List I(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : B(list.get(0)) : EmptyList.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.nq0 J(java.lang.String r18) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br9.J(java.lang.String):nq0");
    }

    public static ImmutableList K(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        lj3 lj3VarM = ImmutableList.m();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (sb7.n(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strI = sb7.i(xmlPullParser, strConcat3);
                String strI2 = sb7.i(xmlPullParser, strConcat4);
                String strI3 = sb7.i(xmlPullParser, strConcat5);
                String strI4 = sb7.i(xmlPullParser, strConcat6);
                if (strI == null || strI2 == null) {
                    return ImmutableList.q();
                }
                lj3VarM.O(new xy4(strI3 != null ? Long.parseLong(strI3) : 0L, strI4 != null ? Long.parseLong(strI4) : 0L, strI));
            }
        } while (!sb7.m(xmlPullParser, strConcat2));
        return lj3VarM.S();
    }

    public static final ArrayList L(List list, List list2, qz0 qz0Var, int i2) {
        List list3;
        qz0 qz0Var2;
        ArrayList arrayList;
        Object objM = qz0Var.M();
        av avVar = jz0.a;
        if (objM == avVar) {
            objM = new LinkedHashSet();
            qz0Var.l0(objM);
        }
        Set set = (Set) objM;
        Object objM2 = qz0Var.M();
        if (objM2 == avVar) {
            objM2 = new LinkedHashSet();
            qz0Var.l0(objM2);
        }
        Set set2 = (Set) objM2;
        qz0Var.a0(110758886);
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                List list4 = list2;
                arrayList.add(t((dj5) list.get(i3), list4, set, set2, qz0Var, i2 & 112));
                i3++;
                list2 = list4;
            }
            list3 = list2;
            qz0Var2 = qz0Var;
        } else {
            list3 = list2;
            qz0Var2 = qz0Var;
            arrayList = new ArrayList(wu0.V(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(t((dj5) it.next(), list3, set, set2, qz0Var2, i2 & 112));
            }
        }
        ArrayList arrayList2 = arrayList;
        qz0Var2.q(false);
        l(arrayList2, list3, set, set2, qz0Var2, i2 & 112);
        return arrayList2;
    }

    public static final hx4 M(ey7 ey7Var, qz0 qz0Var) {
        qz0Var.a0(-363477779);
        final qj1 qj1Var = (qj1) qz0Var.j(l.h);
        hx4 hx4VarG = null;
        hx4 hx4VarO = b.o(b.c, null, 3);
        hx4 hx4Var = ex4.b;
        if (ey7Var != null) {
            final long j2 = ey7Var.a;
            qz0Var.a0(-1859173560);
            boolean zF = qz0Var.f(qj1Var) | qz0Var.e(j2);
            Object objM = qz0Var.M();
            if (zF || objM == jz0.a) {
                objM = new rp2() { // from class: s72
                    @Override // defpackage.rp2
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        el4 el4Var = (el4) obj;
                        yk4 yk4Var = (yk4) obj2;
                        js3.p(el4Var, "$this$layout");
                        js3.p(yk4Var, "measurable");
                        long j3 = j2;
                        float fE = ey7.e(j3);
                        qj1 qj1Var2 = qj1Var;
                        long jA = uy6.a(qj1Var2.S(fE), qj1Var2.S(ey7.c(j3)));
                        float f2 = ml9.f(jA, uy6.a(h31.h(r3.a), h31.g(r3.a)));
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        int i2 = ae7.a;
                        long j4 = ((h31) obj3).a;
                        float fE2 = ey7.e(jA);
                        int i3 = ae7.a;
                        b96 b96VarT = yk4Var.t(h31.a(j4, 0, ok4.V(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) * fE2), 0, ok4.V(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) * ey7.c(jA)), 5));
                        return el4Var.D(b96VarT.a, b96VarT.b, kotlin.collections.b.I(), new q(b96VarT, 3));
                    }
                };
                qz0Var.l0(objM);
            }
            qz0Var.q(false);
            hx4VarG = js3.G(hx4Var, (rp2) objM);
        }
        if (hx4VarG != null) {
            hx4Var = hx4VarG;
        }
        hx4 hx4VarD = hx4VarO.d(hx4Var);
        qz0Var.q(false);
        return hx4VarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object N(int r6, java.lang.Object r7, defpackage.p67 r8, defpackage.fj2 r9, int r10) {
        /*
            boolean r0 = r7 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r7
        L5:
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            fj2 r0 = r8.b
            boolean r0 = defpackage.js3.i(r0, r9)
            if (r0 != 0) goto L29
            fj2 r0 = defpackage.fj2.d
            int r3 = r9.compareTo(r0)
            if (r3 < 0) goto L29
            fj2 r3 = r8.b
            int r3 = r3.a
            int r0 = r0.a
            int r0 = defpackage.js3.r(r3, r0)
            if (r0 >= 0) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            r3 = 2
            r6 = r6 & r3
            if (r6 == 0) goto L36
            r8.getClass()
            if (r10 != 0) goto L34
            goto L36
        L34:
            r6 = r2
            goto L37
        L36:
            r6 = r1
        L37:
            if (r6 != 0) goto L3c
            if (r0 != 0) goto L3c
            return r7
        L3c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L5d
            if (r6 == 0) goto L48
            if (r10 != r2) goto L48
            r6 = r2
            goto L49
        L48:
            r6 = r1
        L49:
            if (r6 == 0) goto L4f
            if (r0 == 0) goto L4f
            r1 = 3
            goto L56
        L4f:
            if (r0 == 0) goto L53
            r1 = r2
            goto L56
        L53:
            if (r6 == 0) goto L56
            r1 = r3
        L56:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r7, r1)
            return r6
        L5d:
            if (r0 == 0) goto L62
            int r9 = r9.a
            goto L66
        L62:
            fj2 r9 = r8.b
            int r9 = r9.a
        L66:
            if (r6 == 0) goto L6c
            if (r10 != r2) goto L6f
            r1 = r2
            goto L6f
        L6c:
            r8.getClass()
        L6f:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = defpackage.ul.e(r7, r9, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br9.N(int, java.lang.Object, p67, fj2, int):java.lang.Object");
    }

    public static void O() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void P() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void Q(t0 t0Var, Number number) {
        t0.t(t0Var, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String R(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) D(-1, str2));
    }

    public static Class S(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    public static void T(StringBuilder sb, HashMap map) {
        sb.append("{");
        boolean z = true;
        for (String str : map.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = (String) map.get(str);
            t61.y(sb, "\"", str, "\":");
            if (str2 == null) {
                sb.append(Ssh2PublicKeyAlgorithmName.NULL);
            } else {
                t61.y(sb, "\"", str2, "\"");
            }
            z = false;
        }
        sb.append("}");
    }

    public static synchronized void U(go8 go8Var) {
        if (a != null) {
            throw new IllegalStateException("init() already called");
        }
        a = go8Var;
    }

    public static final void a(hx4 hx4Var, t9 t9Var, x9 x9Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        int i3;
        String strF;
        long j2;
        Context context;
        String str;
        qz0 qz0Var2;
        boolean z;
        Context context2;
        boolean z2;
        long j3;
        int i4;
        ex4 ex4Var;
        qz0 qz0Var3;
        x9 x9Var2;
        qz0 qz0Var4 = qz0Var;
        qz0Var4.c0(-2036705365);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var4.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var4.h(t9Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var4.h(x9Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var4.h(dp2Var) ? 2048 : 1024;
        }
        int i5 = i3;
        if (qz0Var4.R(i5 & 1, (i5 & 1171) != 1170)) {
            Context context3 = (Context) qz0Var4.j(e.b);
            long j4 = wu8.x(qz0Var4).i;
            qz0Var4.a0(1231240988);
            w9 w9VarA = x9Var.a();
            if (w9VarA instanceof u9) {
                qz0Var4.a0(-1638528727);
                strF = ln2.f(vs6.player_ad_install_button, qz0Var4);
                qz0Var4.q(false);
            } else {
                if (!(w9VarA instanceof v9)) {
                    qz0Var4.a0(-1638529987);
                    qz0Var4.q(false);
                    throw new NoWhenBranchMatchedException();
                }
                qz0Var4.a0(-1638526116);
                qz0Var4.q(false);
                strF = ((v9) w9VarA).a;
            }
            qz0Var4.q(false);
            vv0 vv0VarA = tv0.a(jv.c, eq.p, qz0Var4, 48);
            long j5 = qz0Var4.T;
            int i6 = (int) (j5 ^ (j5 >>> 32));
            j56 j56VarL = qz0Var4.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var4, hx4Var);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var4.e0();
            if (qz0Var4.S) {
                qz0Var4.k(bp2Var);
            } else {
                qz0Var4.o0();
            }
            ia7.o(qz0Var4, d.f, vv0VarA);
            ia7.o(qz0Var4, d.e, j56VarL);
            ia7.g(qz0Var4, Integer.valueOf(i6), d.g);
            ia7.n(qz0Var4, d.h);
            ia7.o(qz0Var4, d.d, hx4VarC);
            String strD = x9Var.d();
            if (strD == null || f88.n0(strD)) {
                strD = null;
            }
            ex4 ex4Var2 = ex4.b;
            if (strD == null) {
                qz0Var4.a0(153648106);
                qz0Var4.q(false);
                context = context3;
                str = strF;
                j2 = j4;
                qz0Var2 = qz0Var4;
                z = false;
            } else {
                qz0Var4.a0(153648107);
                hx4 hx4VarC2 = ix4.c(qz0Var4, zk8.s(b.i(ex4Var2, ml9.q(hq6.ad_end_card_icon_size, qz0Var4)), la7.a(ml9.q(hq6.radius_4, qz0Var4))));
                j2 = j4;
                context = context3;
                str = strF;
                qz0Var2 = qz0Var4;
                z = false;
                cc7.a(strD, hx4VarC2, p41.a, null, qz0Var2, 1572912, 1976);
                qz0Var2.q(false);
            }
            z27.a(qz0Var2, b.d(ex4Var2, ml9.q(hq6.size_16, qz0Var2)));
            String strB = x9Var.b();
            if (strB == null) {
                qz0Var2.a0(154067040);
                qz0Var2.q(z);
                z2 = z;
                ex4Var = ex4Var2;
                j3 = j2;
                i4 = i5;
                context2 = context;
                qz0Var3 = qz0Var2;
            } else {
                qz0Var2.a0(154067041);
                context2 = context;
                z2 = z;
                j3 = j2;
                i4 = i5;
                ex4Var = ex4Var2;
                mi8.b(strB, null, wu8.x(qz0Var2).j, 0L, 0L, null, 0L, 0, false, 1, 0, wu8.y(qz0Var2).b, qz0Var, 0, 24576, 114682);
                qz0Var3 = qz0Var;
                qz0Var3.q(z2);
            }
            z27.a(qz0Var3, b.d(ex4Var, ml9.q(hq6.size_2, qz0Var3)));
            String strC = x9Var.c();
            if (strC == null) {
                qz0Var3.a0(154346753);
            } else {
                qz0Var3.a0(154346754);
                mi8.b(strC, null, wu8.x(qz0Var3).k, 0L, 0L, null, 0L, 0, false, 1, 0, wu8.y(qz0Var3).g, qz0Var, 0, 24576, 114682);
                qz0Var3 = qz0Var;
            }
            qz0Var3.q(z2);
            z27.a(qz0Var3, b.d(ex4Var, ml9.q(hq6.size_16, qz0Var3)));
            wy5 wy5Var = ci0.a;
            bi0 bi0VarA = ci0.a(wu8.x(qz0Var3).a, wu8.x(qz0Var3).b, 0L, 0L, qz0Var, 12);
            qz0Var4 = qz0Var;
            ka7 ka7Var = la7.a;
            float fQ = ml9.q(hq6.space_16, qz0Var4);
            float fQ2 = ml9.q(hq6.space_8, qz0Var4);
            wy5 wy5Var2 = new wy5(fQ, fQ2, fQ, fQ2);
            Context context4 = context2;
            long j6 = j3;
            boolean zH = qz0Var4.h(t9Var) | ((i4 & 7168) == 2048 ? true : z2) | qz0Var4.h(x9Var) | qz0Var4.h(context4) | qz0Var4.e(j6);
            Object objM = qz0Var4.M();
            if (zH || objM == jz0.a) {
                da daVar = new da(dp2Var, t9Var, x9Var, context4, j6);
                x9Var2 = x9Var;
                qz0Var4.l0(daVar);
                objM = daVar;
            } else {
                x9Var2 = x9Var;
            }
            androidx.compose.material3.a.a((bp2) objM, null, false, ka7Var, bi0VarA, null, null, wy5Var2, s7.X(-1744103919, new x5(str, x9Var2, 2), qz0Var4), qz0Var4, 805306368, 358);
            qz0Var4.q(true);
        } else {
            qz0Var4.U();
        }
        my6 my6VarS = qz0Var4.s();
        if (my6VarS != null) {
            my6VarS.d = new ea(hx4Var, t9Var, x9Var, dp2Var, i2, 0);
        }
    }

    public static final void b(hx4 hx4Var, t9 t9Var, dp2 dp2Var, dp2 dp2Var2, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(-453020598);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(t9Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.h(dp2Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var.h(dp2Var2) ? 2048 : 1024;
        }
        if (qz0Var.R(i3 & 1, (i3 & 1171) != 1170)) {
            hx4 hx4VarC = b.c(hx4Var, 1.0f);
            cb7 cb7VarA = bb7.a(jv.e, eq.m, qz0Var, 54);
            long j2 = qz0Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var, hx4VarC);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, d.f, cb7VarA);
            ia7.o(qz0Var, d.e, j56VarL);
            ia7.g(qz0Var, Integer.valueOf(i4), d.g);
            ia7.n(qz0Var, d.h);
            ia7.o(qz0Var, d.d, hx4VarC2);
            float fQ = ml9.q(hq6.space_12, qz0Var);
            ex4 ex4Var = ex4.b;
            ir.myket.player.ui.client.ad.components.a.b(yh0.z(ex4Var, fQ), t9Var.b, dp2Var2, qz0Var, (i3 >> 3) & 896);
            g16 g16VarG = rf0.G(br6.player_ic_close, qz0Var);
            Object objJ = qz0Var.j(uj8.a);
            js3.m(objJ);
            long j3 = ((tj8) objJ).j;
            hx4 hx4VarS = zk8.s(yh0.z(b.i(ex4Var, ml9.q(hq6.ad_end_card_close_icon_size, qz0Var)), ml9.q(hq6.space_16, qz0Var)), la7.a);
            v97 v97Var = new v97(0);
            boolean zH = ((i3 & 896) == 256) | qz0Var.h(t9Var) | ((i3 & 7168) == 2048);
            Object objM = qz0Var.M();
            if (zH || objM == jz0.a) {
                objM = new f8(dp2Var, t9Var, dp2Var2, 5);
                qz0Var.l0(objM);
            }
            kh3.a(g16VarG, f.b(hx4VarS, false, null, v97Var, (bp2) objM, 11), j3, qz0Var, 56, 0);
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ea(hx4Var, t9Var, dp2Var, dp2Var2, i2);
        }
    }

    public static final void c(p9 p9Var, dp2 dp2Var, dp2 dp2Var2, qz0 qz0Var, int i2) {
        int i3;
        dp2 dp2Var3;
        qz0 qz0Var2 = qz0Var;
        js3.p(p9Var, "adContentViewState");
        qz0Var2.c0(599939080);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var2.h(p9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & 384) == 0) {
            i4 |= qz0Var2.h(dp2Var2) ? 256 : 128;
        }
        if (qz0Var2.R(i4 & 1, (i4 & 147) != 146)) {
            Object objM = qz0Var2.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = new k7(1);
                qz0Var2.l0(objM);
            }
            dp2 dp2Var4 = (dp2) objM;
            t9 t9Var = p9Var.a;
            boolean z = (i4 & 896) == 256;
            Object objM2 = qz0Var2.M();
            if (z || objM2 == avVar) {
                objM2 = new ba(0, dp2Var2);
                qz0Var2.l0(objM2);
            }
            xq2.b(false, (bp2) objM2, qz0Var2, 0, 1);
            FillElement fillElement = b.c;
            boolean zH = ((i4 & 112) == 32) | qz0Var2.h(t9Var);
            Object objM3 = qz0Var2.M();
            if (zH || objM3 == avVar) {
                objM3 = new d(dp2Var4, t9Var, 4);
                qz0Var2.l0(objM3);
            }
            hx4 hx4VarH = H(fillElement, (bp2) objM3);
            cl4 cl4VarD = bg0.d(eq.c, false);
            long j2 = qz0Var2.T;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, hx4VarH);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, d.f, cl4VarD);
            ia7.o(qz0Var2, d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i5), d.g);
            ia7.n(qz0Var2, d.h);
            ia7.o(qz0Var2, d.d, hx4VarC);
            cc7.a(t9Var.a, fillElement, p41.a, null, qz0Var, 1573296, 1976);
            Object objJ = qz0Var.j(uj8.a);
            js3.m(objJ);
            bg0.a(rq4.f(fillElement, ((tj8) objJ).E, tt3.d), qz0Var, 0);
            cb0 cb0Var = eq.d;
            ng0 ng0Var = ng0.a;
            ex4 ex4Var = ex4.b;
            b(ng0Var.a(ex4Var, cb0Var), t9Var, dp2Var4, dp2Var2, qz0Var, (i4 << 3) & 8064);
            qz0Var2 = qz0Var;
            a(ng0Var.a(ex4Var, eq.g), t9Var, p9Var.b, dp2Var4, qz0Var2, (i4 << 6) & 7168);
            qz0Var2.q(true);
            dp2Var3 = dp2Var4;
        } else {
            qz0Var2.U();
            dp2Var3 = dp2Var;
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(i2, 0, p9Var, dp2Var3, dp2Var2);
        }
    }

    public static final uf d(String str) {
        return new uf(a77.p(str));
    }

    public static final long e(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
    }

    public static final long f(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final JsonEncodingException g(Number number, String str) {
        js3.p(str, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) D(-1, str)));
    }

    public static final JsonEncodingException h(no7 no7Var) {
        js3.p(no7Var, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + no7Var.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + no7Var.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException i(int i2, CharSequence charSequence, String str) {
        js3.p(str, "message");
        js3.p(charSequence, "input");
        return j(i2, str + "\nJSON input: " + ((Object) D(i2, charSequence)));
    }

    public static final JsonDecodingException j(int i2, String str) {
        js3.p(str, "message");
        if (i2 >= 0) {
            str = "Unexpected JSON token at offset " + i2 + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(defpackage.hx4 r30, defpackage.xe6 r31, androidx.compose.material3.n r32, defpackage.bp2 r33, defpackage.dl5 r34, defpackage.qz0 r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br9.k(hx4, xe6, androidx.compose.material3.n, bp2, dl5, qz0, int, int):void");
    }

    public static final void l(ArrayList arrayList, List list, Set set, Set set2, qz0 qz0Var, int i2) {
        qz0Var.c0(-720826424);
        int i3 = (i2 & 6) == 0 ? (qz0Var.h(arrayList) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.h(set) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var.h(set2) ? 2048 : 1024;
        }
        if (qz0Var.R(i3 & 1, (i3 & 1171) != 1170)) {
            wb5 wb5VarK = g.k(arrayList, qz0Var);
            wb5 wb5VarK2 = g.k(list, qz0Var);
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = ((dj5) arrayList.get(i4)).b;
                set.add(obj);
                List listP0 = kotlin.collections.a.P0(arrayList);
                boolean zF = qz0Var.f(wb5VarK) | qz0Var.h(obj) | qz0Var.h(set) | qz0Var.h(set2) | qz0Var.f(wb5VarK2);
                Object objM = qz0Var.M();
                if (zF || objM == jz0.a) {
                    rg rgVar = new rg(obj, set, set2, wb5VarK, wb5VarK2, 1);
                    qz0Var.l0(rgVar);
                    objM = rgVar;
                }
                zk8.e(obj, listP0, (dp2) objM, qz0Var);
            }
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ea(arrayList, list, set, set2, i2, 5);
        }
    }

    public static final Object m(g96 g96Var, int i2) {
        if (i2 >= 0) {
            iz5 iz5Var = (iz5) g96Var;
            if (i2 < iz5Var.d()) {
                int i3 = i2 - iz5Var.c;
                if (i3 < 0 || i3 >= iz5Var.b) {
                    return null;
                }
                return iz5Var.b(i3);
            }
        }
        StringBuilder sbR = rm7.r(i2, "Index: ", ", Size: ");
        sbR.append(((iz5) g96Var).d());
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    public static void n(fz7 fz7Var, List list, ny6 ny6Var) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iC = fz7Var.c((ge) list.get(i2));
            int iP = fz7Var.P(fz7Var.b, fz7Var.r(iC));
            Object obj = iP < fz7Var.g(fz7Var.b, fz7Var.r(iC + 1)) ? fz7Var.c[fz7Var.h(iP)] : jz0.a;
            my6 my6Var = obj instanceof my6 ? (my6) obj : null;
            if (my6Var != null) {
                my6Var.a = ny6Var;
            }
        }
    }

    public static ArrayList o(Object... objArr) {
        js3.p(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new kv(objArr, true));
    }

    public static int p(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        js3.p(arrayList, "<this>");
        int size2 = arrayList.size();
        if (size < 0) {
            throw new IllegalArgumentException(bl4.q(size, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i2 = size - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int iT = bt2.t((Comparable) arrayList.get(i4), comparable);
            if (iT < 0) {
                i3 = i4 + 1;
            } else {
                if (iT <= 0) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static ListBuilder q(List list) {
        js3.p(list, "builder");
        ListBuilder listBuilder = (ListBuilder) list;
        listBuilder.i();
        listBuilder.c = true;
        return listBuilder.b > 0 ? listBuilder : ListBuilder.d;
    }

    public static final ih3 r(int i2, p61 p61Var, xc6 xc6Var, dl5 dl5Var, bp2 bp2Var, qz0 qz0Var, int i3) {
        String strF = ln2.f(p61Var.a, qz0Var);
        boolean z = true;
        boolean z2 = ((((57344 & i3) ^ 24576) > 16384 && qz0Var.f(bp2Var)) || (i3 & 24576) == 16384) | ((((i3 & 112) ^ 48) > 32 && qz0Var.f(p61Var)) || (i3 & 48) == 32) | ((((i3 & 7168) ^ 3072) > 2048 && qz0Var.h(dl5Var)) || (i3 & 3072) == 2048);
        if ((((i3 & 896) ^ 384) <= 256 || !qz0Var.f(xc6Var)) && (i3 & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM = qz0Var.M();
        if (z3 || objM == jz0.a) {
            pp ppVar = new pp(bp2Var, p61Var, dl5Var, xc6Var, 6);
            qz0Var.l0(ppVar);
            objM = ppVar;
        }
        return new ih3(i2, strF, null, (bp2) objM, 4);
    }

    public static ListBuilder s() {
        return new ListBuilder(10);
    }

    public static final dj5 t(final dj5 dj5Var, final List list, final Set set, final Set set2, qz0 qz0Var, int i2) {
        qz0Var.a0(-1239021605);
        final wb5 wb5VarK = g.k(list, qz0Var);
        final Object obj = dj5Var.b;
        qz0Var.Y(-993800456, obj);
        dj5 dj5Var2 = new dj5(dj5Var, s7.X(-1349345695, new rp2() { // from class: lc1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
            @Override // defpackage.rp2
            public final Object a(Object obj2, Object obj3, Object obj4) {
                ?? I0;
                qz0 qz0Var2 = (qz0) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if (qz0Var2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Set set3 = set2;
                    boolean zH = qz0Var2.h(set3);
                    Object obj5 = obj;
                    boolean zH2 = zH | qz0Var2.h(obj5);
                    Set set4 = set;
                    boolean zH3 = zH2 | qz0Var2.h(set4);
                    wb5 wb5Var = wb5VarK;
                    boolean zF = zH3 | qz0Var2.f(wb5Var);
                    Object objM = qz0Var2.M();
                    if (zF || objM == jz0.a) {
                        zi ziVar = new zi(set3, obj5, set4, wb5Var, 3);
                        qz0Var2.l0(ziVar);
                        objM = ziVar;
                    }
                    zk8.d(obj5, (dp2) objM, qz0Var2);
                    qz0Var2.a0(358947325);
                    List list2 = list;
                    if (list2 instanceof RandomAccess) {
                        sb5 sb5Var = new sb5(list2.size());
                        I0 = new ArrayList(list2.size());
                        int size = list2.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Object obj6 = list2.get(i3);
                            if (sb5Var.d(obj6)) {
                                I0.add(obj6);
                            }
                        }
                    } else {
                        I0 = kotlin.collections.a.i0(list2);
                    }
                    boolean zIsEmpty = I0.isEmpty();
                    dj5 dj5Var3 = dj5Var;
                    if (!zIsEmpty) {
                        ListIterator listIterator = I0.listIterator(I0.size());
                        while (listIterator.hasPrevious()) {
                            dj5Var3 = new dj5(dj5Var3, s7.X(-330823412, new x5((ej5) listIterator.previous(), dj5Var3, 5), qz0Var2));
                        }
                    }
                    qz0Var2.q(false);
                    dj5Var3.a(0, qz0Var2);
                } else {
                    qz0Var2.U();
                }
                return tx8.a;
            }
        }, qz0Var));
        qz0Var.q(false);
        qz0Var.q(false);
        return dj5Var2;
    }

    public static void u(Canvas canvas, boolean z) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z) {
                te.p(canvas);
                return;
            } else {
                te.f(canvas);
                return;
            }
        }
        if (i2 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!n) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                l = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                m = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            n = true;
        }
        if (z) {
            try {
                Method method2 = l;
                if (method2 != null) {
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        if (z || (method = m) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final int v(int i2, t34 t34Var, Object obj) {
        int iA;
        return (obj == null || t34Var.c() == 0 || (i2 < t34Var.c() && obj.equals(t34Var.d(i2))) || (iA = t34Var.d.a(obj)) == -1) ? i2 : iA;
    }

    public static final String[] w(s41 s41Var) {
        js3.n(s41Var, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((uf) s41Var).b.toArray(new String[0]);
    }

    public static uq3 x(Collection collection) {
        js3.p(collection, "<this>");
        return new uq3(0, collection.size() - 1, 1);
    }

    public static int y(List list) {
        js3.p(list, "<this>");
        return list.size() - 1;
    }

    public static final r0[] z() {
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        return new r0[]{new yp(), new zp(), new hu(), new rb0(), new xk1(), new yk1(), new ds1(), new hq2(), new ny2(), new nl3(), new s74(), new w84(), new ug4(), new wg5(), new jp(), new mw5(), new qw5(), new tk3(2), new dl6(), new kk6(), new w87(), new ti7(), new tk3(i2), new zm8(), new t92(), new jd5(), new o49(), new i45(), new z76(), new vt1(i2), new uq7(), new tk3(i3), new gs1(), new pz8(), new ud0(i3), new dl7(i3), new kv7(), new au5(), new ny5(), new si7(), new lu(), new vt1(2), new vt1(0), new st1(), new yp3(), new lx0(i4), new bl3(i4), new la(), new gq0(), new vc6()};
    }
}
