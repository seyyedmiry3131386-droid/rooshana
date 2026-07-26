package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl;
import ir.mservices.market.core.PatchUtils;
import ir.mservices.market.data.permission.Permission;
import ir.mservices.market.data.permission.PermissionReasonId;
import ir.mservices.market.data.permission.PermissionResult;
import ir.mservices.market.data.permission.Quality;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.download.common.data.DownloadDataUrlDto;
import ir.mservices.market.download.common.data.DownloadUrlDto;
import ir.mservices.market.download.common.data.UrlDto;
import ir.mservices.market.version2.ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.download.DownloadTag;
import ir.mservices.market.version2.manager.install.f;
import ir.mservices.market.version2.manager.serverUrl.AppServersModel$AppServersParseException;
import ir.mservices.market.version2.manager.serverUrl.downloadserver.a;
import ir.mservices.market.version2.services.c;
import ir.mservices.market.version2.services.d;
import ir.mservices.market.version2.webapi.requestdto.SpixDownloadRequestDto;
import ir.mservices.market.version2.webapi.requestdto.SpixDownloadType;
import ir.mservices.market.version2.webapi.requestdto.SpixUserRequestDto;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import kotlin.Result;
import kotlin.b;
import nene.downloadmanager.exceptions.downloadfail.NeneIntegrityException;
import nene.downloadmanager.exceptions.downloadfail.NeneNetworkBadResponseException;
import nene.downloadmanager.exceptions.downloadfail.NenePostProcessErrorException;
import nene.downloadmanager.exceptions.downloadfail.NenePostProcessNoCategoryException;
import nene.downloadmanager.exceptions.downloadfail.NeneStorageException;

/* JADX INFO: loaded from: classes3.dex */
public final class ps1 implements vs1, ts1, nr1 {
    public g6 a;
    public final xl5 b;
    public qq4 c;
    public final a d;
    public final Context e;
    public final pr7 f;
    public final PatchUtils g;
    public dr1 i;
    public dr1 j;
    public c k;
    public dr1 l;
    public c5 m;
    public k68 n;
    public d56 o;
    public b56 p;
    public d q;
    public dr1 r;
    public final HashMap h = new HashMap();
    public final Object s = bt2.D(ir.myket.callback.manager.a.class);

    public ps1(t32 t32Var, qs1 qs1Var, wl5 wl5Var, a aVar, Context context, pr7 pr7Var) {
        this.d = aVar;
        this.e = context;
        this.f = pr7Var;
        PatchUtils patchUtils = new PatchUtils();
        patchUtils.a = false;
        this.g = patchUtils;
        t32Var.l(this, false);
        sb7.p("MyketDownloadManager", "Starting to initial NENE...", null);
        xl5 xl5Var = new xl5(context, "NeneDatabase", 1, 1, this, this, qs1Var, wl5Var);
        this.b = xl5Var;
        List listC = xl5Var.c();
        sb7.p("MyketDownloadManager", "There are " + listC.size() + " download available in NENE.", null);
        sb7.p("MyketDownloadManager", "NENE Dump: " + new vv2().f(listC), null);
        xl5Var.d(this);
        xl5Var.d(aVar);
    }

    public static String k(int i, String str, String str2) {
        js3.p(str, "packageName");
        js3.p(str2, "splitName");
        if (i == 10) {
            return str;
        }
        if (i == 40) {
            return t61.j(str, "/40/", str2);
        }
        return str + "/" + i;
    }

    public static long o(DownloadUrlDto downloadUrlDto) throws ParseException {
        long jQ = q(downloadUrlDto.getContentLength());
        if (downloadUrlDto.getMainData() != null) {
            jQ += q(downloadUrlDto.getMainData().getContentLength());
        }
        if (downloadUrlDto.getPatchData() != null) {
            jQ += q(downloadUrlDto.getPatchData().getContentLength());
        }
        if (downloadUrlDto.getSplit() != null) {
            Iterator<DownloadDataUrlDto> it = downloadUrlDto.getSplit().iterator();
            while (it.hasNext()) {
                jQ += q(it.next().getContentLength());
            }
        }
        return jQ;
    }

    public static long q(String str) throws ParseException {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            throw ((ParseException) new ParseException(dw1.n("Server response is not valid: ", str), 0).initCause(e));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:21|(10:23|(1:25)(1:26)|(1:28)|(23:239|32|33|216|34|(1:36)(3:38|(2:40|41)|244)|37|224|42|(1:44)(13:45|46|237|48|(1:50)(10:51|218|52|226|55|(1:57)(6:59|230|60|61|64|(2:66|(2:68|(2:70|(2:72|(2:74|75)(2:76|77))(2:78|79))(2:80|81))(2:82|83))(2:84|(2:87|88)))|58|61|64|(0)(0))|54|226|55|(0)(0)|58|61|64|(0)(0))|47|46|237|48|(0)(0)|54|226|55|(0)(0)|58|61|64|(0)(0))(1:89)|90|(1:92)|228|93|96|(2:98|(2:100|(2:102|(4:236|104|215|(3:106|(2:107|(2:109|(2:242|111)(1:112))(2:241|115))|(5:117|118|(1:121)|122|123)(4:124|125|126|127))(2:130|131))(2:134|135))(2:136|(6:222|138|139|(1:142)|143|144)(2:148|149)))(2:150|(6:220|152|153|(1:156)|157|158)(2:162|163)))(14:164|(3:166|(1:171)(1:170)|172)|234|173|174|(1:176)(1:177)|178|(1:180)|181|(2:(1:(1:191)(1:192))(1:188)|189)|193|(4:197|(2:200|198)|243|201)|202|203))(1:29)|30|(0)(0)|90|(0)|228|93|96|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:(9:239|32|33|216|34|(1:36)(3:38|(2:40|41)|244)|37|224|42)|(1:44)(13:45|46|237|48|(1:50)(10:51|218|52|226|55|(1:57)(6:59|230|60|61|64|(2:66|(2:68|(2:70|(2:72|(2:74|75)(2:76|77))(2:78|79))(2:80|81))(2:82|83))(2:84|(2:87|88)))|58|61|64|(0)(0))|54|226|55|(0)(0)|58|61|64|(0)(0))|47|46|237|48|(0)(0)|54|226|55|(0)(0)|58|61|64|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021c, code lost:
    
        r7 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0222  */
    @Override // defpackage.vs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.us1 a(defpackage.bs1 r42) throws nene.downloadmanager.exceptions.downloadfail.NeneStorageException, nene.downloadmanager.exceptions.downloadfail.NenePreProcessErrorException, nene.downloadmanager.exceptions.downloadfail.NeneNetworkException, nene.downloadmanager.exceptions.downloadfail.NenePreProcessNoCategoryException {
        /*
            Method dump skipped, instruction units count: 1204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps1.a(bs1):us1");
    }

    @Override // defpackage.ts1
    public final void b(es1 es1Var) throws NeneStorageException, NeneIntegrityException, NoSuchAlgorithmException, IOException, NenePostProcessErrorException, NenePostProcessNoCategoryException {
        Object objA;
        int iO = eq.o(es1Var);
        String strQ = eq.q(es1Var);
        eq.u(es1Var);
        String str = es1Var.c;
        js3.p(str, "filePath");
        try {
            String str2 = k68.e;
            objA = a77.i(str);
        } catch (Throwable th) {
            objA = b.a(th);
        }
        if (objA instanceof Result.Failure) {
            objA = null;
        }
        String str3 = (String) objA;
        String str4 = es1Var.c;
        js3.p(str4, "path");
        File file = new File(str4);
        if (!file.exists()) {
            file = null;
        }
        String strValueOf = String.valueOf(file != null ? file.length() : 0L);
        boolean zN = eq.n(es1Var);
        Object obj = es1Var.e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        String str5 = ((DownloadTag) obj).n;
        js3.o(str5, "type");
        Object obj2 = es1Var.e;
        js3.n(obj2, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        String str6 = ((DownloadTag) obj2).o;
        es1Var.toString();
        sb7.p("MyketDownloadManager", "PostProcess MD5Checksum", "Local: " + str3 + ", Server: " + str6 + ", downloadInfo: " + es1Var);
        String str7 = "";
        if (!TextUtils.isEmpty(str6) && !str6.equalsIgnoreCase(str3)) {
            w(es1Var, SpixDownloadType.POST, "Md5 Check Failed", "");
            lw.g(null, "Md5 Server!=Local", null);
        }
        if (!zN) {
            if (iO == 10) {
                str7 = "APK";
            } else if (iO == 40) {
                str7 = "SPLIT";
            }
            if (iO == 10 || iO == 40) {
                try {
                    String str8 = es1Var.c;
                    String str9 = k68.e;
                    js3.p(str8, "filePath");
                    try {
                        new ZipFile(str8).close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                } catch (ZipException e) {
                    w(es1Var, SpixDownloadType.POST, str7.concat(" Zip Validation Failed"), e.getMessage());
                    return;
                } catch (IOException e2) {
                    w(es1Var, SpixDownloadType.POST, str7.concat(" Zip Validation IO Failed"), e2.getMessage());
                    return;
                }
            }
            return;
        }
        PatchUtils patchUtils = this.g;
        try {
            if (iO == 10) {
                patchUtils.a(es1Var.c, strQ);
            } else if (iO == 20 || iO == 30) {
                patchUtils.b(iO, es1Var.c, strQ);
            } else if (iO != 40) {
            } else {
                patchUtils.f(es1Var.c, str5, strQ);
            }
        } catch (PatchUtils.NotAPatchFileException e3) {
            w(es1Var, SpixDownloadType.POST, "Downloaded file is not patch", e3.getMessage());
            StringBuilder sb = new StringBuilder("Downloaded file is not patch, URL: ");
            o40.I(es1Var.b, ", MD5: ", str3, ", Size: ", sb);
            sb.append(strValueOf);
            throw new NeneIntegrityException(e3, sb.toString());
        } catch (PatchUtils.PatchFailedException e4) {
            w(es1Var, SpixDownloadType.POST, "Patch failed", e4.getMessage());
            StringBuilder sb2 = new StringBuilder("Patch failed, URL: ");
            o40.I(es1Var.b, ", MD5: ", str3, ", Size: ", sb2);
            sb2.append(strValueOf);
            throw new NenePostProcessNoCategoryException(e4, sb2.toString());
        } catch (PatchUtils.PatchSourceNotFoundException e5) {
            w(es1Var, SpixDownloadType.POST, "Couldn't find old version APK to apply patch, maybe it's uninstalled", e5.getMessage());
            throw new NenePostProcessNoCategoryException(e5, "Couldn't find old version APK to apply patch, maybe it's uninstalled");
        } catch (PatchUtils.PatchZipValidationException e6) {
            w(es1Var, SpixDownloadType.POST, "PATCH Zip Validation Failed", e6.getMessage());
        } catch (IOException e7) {
            w(es1Var, SpixDownloadType.POST, "Something gone wrong with a apk file", e7.getMessage());
            StringBuilder sb3 = new StringBuilder("Something gone wrong with a file, Download file: ");
            o40.I(es1Var.c, ", MD5: ", str3, ", Size: ", sb3);
            sb3.append(strValueOf);
            throw new NeneStorageException(e7, sb3.toString());
        } catch (ClassNotFoundException e8) {
            w(es1Var, SpixDownloadType.POST, "Failed to load patch library", e8.getMessage());
            throw new NenePostProcessErrorException(e8, "Failed to load patch library");
        }
    }

    public final void c(DownloadDataModel downloadDataModel, int i, int i2, String str, int i3) throws Throwable {
        lw.d(null, null, downloadDataModel);
        int i4 = downloadDataModel.b;
        String str2 = downloadDataModel.c;
        String str3 = downloadDataModel.d;
        Boolean bool = Boolean.TRUE;
        dp3 dp3Var = (dp3) this.l.get();
        String str4 = downloadDataModel.a;
        this.b.a(null, null, k(i, str4, str), new DownloadTag(i4, i, i2, str2, str3, str, "", "", bool == dp3Var.d(str4, downloadDataModel.b, downloadDataModel.i), "", "", downloadDataModel.j, false, "", "", downloadDataModel.e, downloadDataModel.f, downloadDataModel.g, downloadDataModel.h, downloadDataModel.i, downloadDataModel.m), i3);
    }

    public final void d(int i, int i2, String str, String str2) throws Throwable {
        es1 es1VarB;
        String strK = k(i, str, str2);
        xl5 xl5Var = this.b;
        if (xl5Var.b(strK) == null && (es1VarB = xl5Var.b(k(10, str, ""))) != null && es1VarB.f == 100) {
            c(new DownloadDataModel(str, (DownloadTag) es1VarB.e), i, i2, str2, 201);
        }
    }

    public final AppDownloadInfo e(bs1 bs1Var) {
        ArrayList arrayList = null;
        if (bs1Var == null) {
            return null;
        }
        boolean zV = eq.v(bs1Var);
        boolean z = eq.t(bs1Var) != null;
        if (!zV && !z) {
            return new AppDownloadInfo(bs1Var);
        }
        String strQ = eq.q(bs1Var);
        String strK = k(10, strQ, "");
        xl5 xl5Var = this.b;
        es1 es1VarB = xl5Var.b(strK);
        if (es1VarB != null) {
            String[] strArrT = eq.t(es1VarB);
            if (strArrT != null) {
                arrayList = new ArrayList();
                for (String str : strArrT) {
                    arrayList.add(xl5Var.b(k(40, strQ, str)));
                }
            }
            return new AppDownloadInfo(es1VarB, xl5Var.b(k(20, strQ, "")), xl5Var.b(k(30, strQ, "")), arrayList);
        }
        sb7.p("MyketDownloadManager", "Apk download must not be null", "packageName: " + strQ + ", withData: " + zV + ", split: " + z + ", downloadInfo: " + bs1Var);
        return null;
    }

    public final void f(DownloadDataModel downloadDataModel) {
        lw.c(downloadDataModel.a, null);
        es1 es1VarB = this.b.b(k(10, downloadDataModel.a, ""));
        Context context = this.e;
        if (!dp3.c(context)) {
            this.c = new qq4(es1VarB, downloadDataModel);
            t32.b().g(new e80(5000));
            return;
        }
        if (!downloadDataModel.l && !downloadDataModel.k) {
            t(downloadDataModel, es1VarB);
            return;
        }
        b56 b56Var = this.p;
        Resources resources = context.getResources();
        b56Var.getClass();
        Permission permissionA = b56.a(resources, 2, PermissionReasonId.a, Quality.MANDATORY);
        d56 d56Var = this.o;
        String str = permissionA.b;
        d56Var.getClass();
        if (d56.c(context, str)) {
            t(downloadDataModel, es1VarB);
        } else {
            this.c = new qq4(es1VarB, downloadDataModel);
            t32.b().j(new h60(new Permission[]{permissionA}));
        }
    }

    public final us1 g(bs1 bs1Var, UrlDto urlDto, String str) throws NeneNetworkBadResponseException {
        try {
            ArrayList arrayListA = qs.a(qs.a, urlDto.getUriServers());
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                }
            }
            String str2 = (String) new ls1(this).q(arrayListA);
            if (TextUtils.isEmpty(urlDto.getUriPath())) {
                throw new NeneNetworkBadResponseException("URI in response is empty, " + urlDto);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append('/');
            String uriPath = urlDto.getUriPath();
            if (TextUtils.isEmpty(uriPath)) {
                uriPath = null;
            } else {
                if (uriPath.charAt(0) == '/') {
                    uriPath = uriPath.substring(1, uriPath.length());
                }
                if (uriPath.charAt(uriPath.length() - 1) == '/') {
                    uriPath = uriPath.substring(0, uriPath.length() - 1);
                }
            }
            sb.append(uriPath);
            String string = sb.toString();
            us1 us1Var = new us1(string);
            es1 es1Var = (es1) bs1Var;
            if (TextUtils.isEmpty(es1Var.c) || !es1Var.c.equalsIgnoreCase(str)) {
                us1Var.b = str;
            } else if (!TextUtils.isEmpty(es1Var.b)) {
                String str3 = es1Var.b;
                String queryParameter = str3 != null ? Uri.parse(str3).getQueryParameter("tag") : null;
                String queryParameter2 = string != null ? Uri.parse(string).getQueryParameter("tag") : null;
                if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) {
                    if (TextUtils.isEmpty(queryParameter2)) {
                        throw new NeneNetworkBadResponseException("Parameter tag is empty in download URL: " + string + ", Download info: " + bs1Var);
                    }
                } else if (!queryParameter.equalsIgnoreCase(queryParameter2)) {
                    us1Var.b = str;
                }
            }
            return us1Var;
        } catch (AppServersModel$AppServersParseException e) {
            throw new NeneNetworkBadResponseException(e, "URI servers are not correct, " + urlDto);
        }
    }

    public final HashMap h() {
        List listC = this.b.c();
        HashMap map = new HashMap(listC.size());
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            AppDownloadInfo appDownloadInfoE = e((bs1) it.next());
            if (appDownloadInfoE != null) {
                map.put(appDownloadInfoE.getPackageName(), appDownloadInfoE);
            }
        }
        lw.f(null, null, map.size() <= listC.size());
        return map;
    }

    public final AppDownloadInfo i(String str, Integer num) {
        lw.c(str, null);
        es1 es1VarB = this.b.b(k(10, str, ""));
        if (es1VarB == null || !(num == null || num.intValue() == eq.u(es1VarB))) {
            return null;
        }
        return e(es1VarB);
    }

    public final int l(String str) {
        lw.c(str, null);
        AppDownloadInfo appDownloadInfoI = i(str, null);
        if (appDownloadInfoI == null) {
            return 190;
        }
        return appDownloadInfoI.getStatus();
    }

    public final List m() {
        List<bs1> listF = this.b.a.c.f();
        if (listF.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(listF.size());
        ArrayList arrayList2 = new ArrayList();
        for (bs1 bs1Var : listF) {
            if (!arrayList2.contains(eq.q(bs1Var))) {
                arrayList2.add(eq.q(bs1Var));
                AppDownloadInfo appDownloadInfoE = e(bs1Var);
                if (appDownloadInfoE != null) {
                    arrayList.add(appDownloadInfoE);
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.nr1
    public final void n(es1 es1Var, int i) throws Throwable {
        int i2;
        String strA;
        if (i == 251) {
            AppDownloadInfo appDownloadInfoE = e(es1Var);
            if (appDownloadInfoE == null || appDownloadInfoE.getStatus() != 140) {
                i2 = 0;
            } else {
                String strQ = eq.q(es1Var);
                int iU = eq.u(es1Var);
                String str = es1Var.b;
                String queryParameter = str != null ? Uri.parse(str).getQueryParameter("tag") : null;
                lw.b("download tag must not be null or empty", "downloadInfo: " + es1Var, TextUtils.isEmpty(queryParameter));
                String downloadRef = appDownloadInfoE.getDownloadRef();
                if (downloadRef == null || f88.n0(downloadRef)) {
                    downloadRef = "other";
                }
                String str2 = downloadRef;
                String refId = appDownloadInfoE.getRefId();
                if (refId == null || f88.n0(refId)) {
                    refId = "ClientUnknown";
                }
                String str3 = refId;
                en enVar = new en(25);
                gd1 gd1Var = new gd1(18);
                boolean zD = ((AppUpdateRepositoryImpl) ((wt) this.j.get())).d(iU, strQ);
                String str4 = (zD && ((af7) this.i.get()).a()) ? "ScheduleInTime" : "Normal";
                c cVar = this.k;
                try {
                    StringBuilder sb = new StringBuilder("Kr$8so@L#(_ToFp-");
                    sb.append((queryParameter == null || f88.n0(queryParameter)) ? "" : queryParameter);
                    sb.append("-");
                    sb.append(this.m.a());
                    String string = sb.toString();
                    js3.p(string, ConfirmDTO.INPUT_TYPE_TEXT);
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    Charset charsetForName = Charset.forName("iso-8859-1");
                    js3.o(charsetForName, "forName(...)");
                    byte[] bytes = string.getBytes(charsetForName);
                    js3.o(bytes, "getBytes(...)");
                    i2 = 0;
                    try {
                        messageDigest.update(bytes, 0, string.length());
                        byte[] bArrDigest = messageDigest.digest();
                        js3.o(bArrDigest, "digest(...)");
                        strA = vi0.a(bArrDigest, false);
                    } catch (Exception unused) {
                        strA = "";
                    }
                } catch (Exception unused2) {
                    i2 = 0;
                }
                cVar.g(strQ, iU, str3, queryParameter, strA, str4, str2, zD, enVar, gd1Var);
            }
            AppDownloadInfo appDownloadInfoE2 = e(es1Var);
            if (appDownloadInfoE2 != null) {
                if (!mt1.b.contains(Integer.valueOf(appDownloadInfoE2.getStatus()))) {
                    appDownloadInfoE2 = null;
                }
                if (appDownloadInfoE2 != null) {
                }
            } else {
                ConcurrentHashMap concurrentHashMap = mt1.a;
            }
        } else {
            i2 = 0;
        }
        if (i == 252 || es1Var.g != 102) {
            return;
        }
        boolean zV = eq.v(es1Var);
        xl5 xl5Var = this.b;
        if (zV) {
            String strQ2 = eq.q(es1Var);
            int iL = eq.l(es1Var);
            if ((iL == 120 || iL == 140) && xl5Var.b(k(20, strQ2, "")) == null) {
                d(20, iL, strQ2, "");
            }
            if ((iL == 130 || iL == 140) && xl5Var.b(k(30, strQ2, "")) == null) {
                d(30, iL, strQ2, "");
            }
        }
        if (eq.t(es1Var) != null) {
            String strQ3 = eq.q(es1Var);
            int iL2 = eq.l(es1Var);
            String[] strArrT = eq.t(es1Var);
            lw.d("split name must not be null", null, strArrT);
            int length = strArrT.length;
            while (i2 < length) {
                String str5 = strArrT[i2];
                if (xl5Var.b(k(40, strQ3, str5)) == null) {
                    d(40, iL2, strQ3, str5);
                }
                i2++;
            }
        }
    }

    public void onEvent(f60 f60Var) {
        qq4 qq4Var;
        if (f60Var.a == 5000 && dp3.c(this.e) && (qq4Var = this.c) != null) {
            f((DownloadDataModel) qq4Var.b);
        }
    }

    public final boolean p() {
        List listC = this.b.c();
        return !listC.isEmpty() && (((es1) ((bs1) listC.get(0))).f == 100 || ((es1) ((bs1) listC.get(0))).f == 110);
    }

    public final void r() {
        ArrayList<bs1> arrayList = new ArrayList(this.b.c());
        ArrayList arrayList2 = new ArrayList();
        for (bs1 bs1Var : arrayList) {
            int i = ((es1) bs1Var).f;
            if (i == 110 || i == 100) {
                arrayList2.add(bs1Var);
            }
        }
        Collections.sort(arrayList2, new yg2(16));
        g6 g6Var = new g6(this, arrayList2, 12);
        this.a = g6Var;
        lw.f(null, null, o27.f().postDelayed(g6Var, 20L));
    }

    public final void s(String str) {
        AppDownloadInfo appDownloadInfoI = i(str, null);
        if (appDownloadInfoI != null) {
            lw.d(null, null, appDownloadInfoI);
            appDownloadInfoI.pauseDownload(this.b);
        }
    }

    public final void t(DownloadDataModel downloadDataModel, bs1 bs1Var) throws Throwable {
        String str = (bs1Var == null || TextUtils.isEmpty(((es1) bs1Var).b)) ? "start" : "resume";
        f fVar = (f) this.r.get();
        fVar.getClass();
        js3.p(downloadDataModel, "downloadDataModel");
        Long l = downloadDataModel.i;
        int i = downloadDataModel.b;
        String str2 = downloadDataModel.a;
        if (Build.VERSION.SDK_INT >= 34 && fVar.d().getMySessions().size() <= 10) {
            fVar.j.o(new ri6(downloadDataModel, str));
        }
        Boolean boolD = ((dp3) this.l.get()).d(str2, i, l);
        AppDownloadInfo appDownloadInfoE = e(bs1Var);
        if (bs1Var != null && appDownloadInfoE != null) {
            boolean zP = eq.p(bs1Var);
            if (eq.u(bs1Var) == i && (boolD == null || zP == boolD.booleanValue())) {
                this.h.put(str2, new ms1(downloadDataModel.g, downloadDataModel.h, l, downloadDataModel.m));
                lw.f("downloadInfo=" + bs1Var + ", neneDownloadPriority=" + dh5.b(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR), "Something is wrong", appDownloadInfoE.startDownload(this.b));
                return;
            }
            sb7.p("DownloadManagerRemove", "removed download from Nene, Want to download another version of app, " + eq.u(bs1Var) + " -> " + i, null);
            eq.u(bs1Var);
            v(str2);
        }
        Integer numP = ((dp3) this.l.get()).p(str2);
        StringBuilder sbB = o40.B(i, "packageName:", str2, ", model versionCode:", ", installed versionCode:");
        sbB.append(numP);
        sbB.append(", downloadInfo:");
        sbB.append(bs1Var);
        sbB.append(", hasForceUpdate:");
        sbB.append(boolD);
        sb7.p("AddDownload", "download version code is wrong", sbB.toString());
        lw.f("packageName:" + str2 + ", model versionCode:" + i + ", installed versionCode:" + numP + ", downloadInfo:" + bs1Var + ", hasForceUpdate:" + boolD, "download version code is wrong", numP == null || boolD == Boolean.TRUE || i > numP.intValue());
        c(downloadDataModel, 10, 110, "", ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
    }

    public final void u(nr1 nr1Var) {
        this.b.d(nr1Var);
    }

    public final void v(String str) {
        AppDownloadInfo appDownloadInfoI = i(str, null);
        if (appDownloadInfoI != null) {
            lw.d(null, null, appDownloadInfoI);
            appDownloadInfoI.removeDownload(this.b);
        }
    }

    public final void w(bs1 bs1Var, SpixDownloadType spixDownloadType, String str, String str2) throws NoSuchAlgorithmException, IOException {
        String str3;
        String strI;
        String str4;
        String host;
        String hostAddress;
        try {
            String strS = eq.s(bs1Var);
            String strQ = eq.q(bs1Var);
            int iU = eq.u(bs1Var);
            boolean zP = eq.p(bs1Var);
            try {
                String str5 = ((es1) bs1Var).c;
                String str6 = k68.e;
                str3 = str;
                strI = a77.i(str5);
            } catch (Exception e) {
                str3 = str + " Error: " + rk1.c(e);
                strI = "";
            }
            Integer numP = ((dp3) this.l.get()).p(strQ);
            if (TextUtils.isEmpty(((es1) bs1Var).b)) {
                str4 = "";
                host = str4;
            } else {
                Uri uri = Uri.parse(((es1) bs1Var).b);
                String str7 = uri.getScheme() + "://" + uri.getHost() + uri.getPath();
                host = uri.getHost();
                str4 = str7;
            }
            if (str4 != null) {
                try {
                    hostAddress = InetAddress.getByName(Uri.parse(str4).getHost()).getHostAddress();
                } catch (Exception unused) {
                    hostAddress = null;
                }
            } else {
                hostAddress = null;
            }
            long j = ((es1) bs1Var).i;
            long j2 = ((es1) bs1Var).h;
            long length = 0;
            try {
                String str8 = ((es1) bs1Var).c;
                String str9 = k68.e;
                js3.p(str8, "path");
                File file = new File(str8);
                if (!file.exists()) {
                    file = null;
                }
                if (file != null) {
                    length = file.length();
                }
            } catch (Exception unused2) {
            }
            String strR = eq.r(bs1Var);
            Object obj = ((es1) bs1Var).e;
            js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
            String str10 = ((DownloadTag) obj).o;
            long j3 = ((es1) bs1Var).j;
            Integer numValueOf = Integer.valueOf(iU);
            String string = spixDownloadType.toString();
            Long lValueOf = Long.valueOf(j);
            Long lValueOf2 = Long.valueOf(j2);
            Boolean boolValueOf = Boolean.valueOf(zP);
            Long lValueOf3 = Long.valueOf(length);
            Long lValueOf4 = Long.valueOf(j3);
            String str11 = k68.e;
            File dataDirectory = Environment.getDataDirectory();
            js3.o(dataDirectory, "getDataDirectory(...)");
            String strL = a77.l(dataDirectory);
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            js3.o(externalStorageDirectory, "getExternalStorageDirectory(...)");
            SpixDownloadRequestDto spixDownloadRequestDto = new SpixDownloadRequestDto(strQ, numValueOf, numP, strS, string, str4, host, hostAddress, lValueOf, lValueOf2, boolValueOf, str3, strI, str2, lValueOf3, strR, lValueOf4, str10, strL, a77.l(externalStorageDirectory));
            SpixUserRequestDto spixUserRequestDto = new SpixUserRequestDto(this.m.a(), this.m.b(), wq2.A(), wq2.x(), wq2.I(), wq2.C());
            sb7.p("MyketDownloadManager", "Download Failed! " + spixDownloadRequestDto, null);
            while (true) {
                try {
                    new ks1(this, spixUserRequestDto, spixDownloadRequestDto).q(new Void[0]);
                    return;
                } catch (InterruptedException unused3) {
                }
            }
        } catch (Exception e2) {
            lw.g(e2, "cannot send download spix log", null);
        }
    }

    public final void x(nr1 nr1Var) {
        ArrayList arrayList = this.b.a.e.a;
        int iIndexOf = arrayList.indexOf(nr1Var);
        if (iIndexOf == -1) {
            nr1Var.toString();
        } else {
            arrayList.remove(iIndexOf);
        }
    }

    public void onEvent(c56 c56Var) throws Throwable {
        qq4 qq4Var;
        for (Permission permission : c56Var.a) {
            if (2 == permission.a) {
                if (permission.d == PermissionResult.GRANTED && (qq4Var = this.c) != null) {
                    DownloadDataModel downloadDataModel = (DownloadDataModel) qq4Var.b;
                    if (!this.n.s(downloadDataModel.a)) {
                        qq4 qq4Var2 = this.c;
                        t((DownloadDataModel) qq4Var2.b, (bs1) qq4Var2.a);
                    } else {
                        this.n.v(downloadDataModel.a);
                        throw null;
                    }
                }
                this.c = null;
                return;
            }
        }
    }

    public void onEvent(ju juVar) throws Throwable {
        if (juVar.b != ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode.b || juVar.a > 950) {
            return;
        }
        xl5 xl5Var = this.b;
        Iterator it = new ArrayList(xl5Var.c()).iterator();
        while (it.hasNext()) {
            xl5Var.a.f((es1) ((bs1) it.next()));
        }
    }

    @Override // defpackage.nr1
    public final void j(bs1 bs1Var) {
    }
}
