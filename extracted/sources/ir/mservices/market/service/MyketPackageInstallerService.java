package ir.mservices.market.service;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.text.TextUtils;
import defpackage.a77;
import defpackage.bp3;
import defpackage.c5;
import defpackage.dp3;
import defpackage.fw4;
import defpackage.hx0;
import defpackage.js3;
import defpackage.jz2;
import defpackage.k68;
import defpackage.lw;
import defpackage.sb7;
import defpackage.t32;
import defpackage.tx8;
import defpackage.wq2;
import defpackage.zk8;
import ir.mservices.market.core.notification.a;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.manager.install.f;
import ir.mservices.market.version2.webapi.requestdto.SpixInstallRequestDto;
import ir.mservices.market.version2.webapi.requestdto.SpixRequestDto;
import ir.mservices.market.version2.webapi.requestdto.SpixUserRequestDto;
import java.io.File;
import java.io.Serializable;
import kotlin.Pair;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
public class MyketPackageInstallerService extends jz2 {
    public bp3 d;
    public dp3 e;
    public fw4 f;
    public f g;

    public static class Message implements Serializable {
        public Intent a;
        public int b;
        public String c;
        public int d;
    }

    public static class PreapprovalMessage implements Serializable {
        public Intent a;
        public int b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        DownloadDataModel downloadDataModel;
        int i3;
        String str;
        int i4;
        DownloadDataModel downloadDataModel2;
        String str2;
        String str3;
        String stringExtra = intent.getStringExtra("android.content.pm.extra.PACKAGE_NAME");
        int intExtra = intent.getIntExtra("android.content.pm.extra.SESSION_ID", -1);
        int intExtra2 = intent.getIntExtra("android.content.pm.extra.STATUS", -999);
        Integer numValueOf = Integer.valueOf(intent.getIntExtra("install_version_code", -1));
        DownloadDataModel downloadDataModel3 = Build.VERSION.SDK_INT >= 34 ? (DownloadDataModel) intent.getSerializableExtra("android.content.pm.extra.PRE_APPROVAL", DownloadDataModel.class) : null;
        boolean booleanExtra = intent.getBooleanExtra("is_split", false);
        sb7.p("MyketPackageService", "onStartCommand(" + stringExtra + ") status=" + intExtra2, null);
        if (intExtra2 == -1) {
            downloadDataModel = downloadDataModel3;
            i3 = 2;
            try {
                Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
                if (downloadDataModel == null || intent2 == null) {
                    Message message = new Message();
                    message.b = intExtra2;
                    message.a = intent;
                    t32.b().j(message);
                } else {
                    sb7.p("PreapprovalUsageTag", "Pending user action due to preapproval requested.", null);
                    intent.addFlags(67108864);
                    intent.addFlags(268435456);
                    PreapprovalMessage preapprovalMessage = new PreapprovalMessage();
                    preapprovalMessage.b = intExtra2;
                    preapprovalMessage.a = intent;
                    t32.b().j(preapprovalMessage);
                }
            } catch (Exception e) {
                sb7.p("MyketPackageService", "sendConfirmToActivity() Exception, e=" + e.getMessage(), null);
                lw.g(e, "MyketPackageInstallerService Error on sendConfirmToActivity()", null);
            }
        } else if (intExtra2 != 0) {
            String stringExtra2 = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
            String stringExtra3 = intent.getStringExtra("android.content.pm.extra.OTHER_PACKAGE_NAME");
            String stringExtra4 = intent.getStringExtra("android.content.pm.extra.STORAGE_PATH");
            sb7.p("MyketPackageService", "onStartCommand(default) status=" + intExtra2 + ", message=" + stringExtra2 + ", installer=" + this.e.v(stringExtra), null);
            this.f.getClass();
            if (fw4.e()) {
                StringBuilder sb = new StringBuilder("Xiaomi INFO: ");
                this.f.getClass();
                sb.append(fw4.a());
                sb7.p("MyketPackageService", sb.toString(), null);
            }
            if (!TextUtils.isEmpty(stringExtra2) && stringExtra2.toLowerCase().contains("Permission denied".toLowerCase())) {
                zk8.X(new IllegalStateException("PackageInstaller PermissionDenied!"), true);
                intExtra2 = 1;
            }
            boolean z = stringExtra != null && this.g.g(stringExtra);
            if (intExtra2 != 3) {
                bp3 bp3Var = this.d;
                dp3 dp3Var = bp3Var.b;
                c5 c5Var = bp3Var.c;
                SpixUserRequestDto spixUserRequestDto = new SpixUserRequestDto(c5Var.a(), c5Var.b(), wq2.A(), wq2.x(), wq2.I(), wq2.C());
                String str4 = stringExtra == null ? Ssh2PublicKeyAlgorithmName.NULL : stringExtra;
                switch (intExtra2) {
                    case 1:
                        str3 = "FAILED";
                        break;
                    case 2:
                        str3 = "BLOCKED";
                        break;
                    case 3:
                        str3 = "ABORTED";
                        break;
                    case 4:
                        str3 = "INVALID";
                        break;
                    case 5:
                        str3 = "CONFLICT";
                        break;
                    case 6:
                        str3 = "STORAGE";
                        break;
                    case 7:
                        str3 = "INCOMPATIBLE";
                        break;
                    default:
                        str3 = "UNKNOWN_ERROR";
                        break;
                }
                String str5 = k68.e;
                File dataDirectory = Environment.getDataDirectory();
                js3.o(dataDirectory, "getDataDirectory(...)");
                String strL = a77.l(dataDirectory);
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                js3.o(externalStorageDirectory, "getExternalStorageDirectory(...)");
                String strL2 = a77.l(externalStorageDirectory);
                bp3Var.d.getClass();
                String str6 = str4;
                String strA = fw4.a();
                String str7 = str3;
                boolean zG = dp3Var.G(stringExtra);
                i4 = intExtra;
                downloadDataModel2 = downloadDataModel3;
                str = stringExtra;
                i3 = 2;
                bp3Var.a.m("install", new SpixRequestDto(spixUserRequestDto, new SpixInstallRequestDto(str6, numValueOf, str7, stringExtra2, stringExtra3, stringExtra4, strL, strL2, strA, zG, booleanExtra, z)));
                if (intExtra2 == 2 && stringExtra3 != null && stringExtra3.length() != 0) {
                    dp3Var.m(stringExtra3);
                }
                bp3 bp3Var2 = this.d;
                Context baseContext = getBaseContext();
                bp3Var2.getClass();
                js3.p(baseContext, "context");
            } else {
                str = stringExtra;
                i4 = intExtra;
                downloadDataModel2 = downloadDataModel3;
                i3 = 2;
            }
            if (z) {
                f fVar = this.g;
                fVar.getClass();
                str2 = str;
                js3.p(str2, "packageName");
                Pair pair = (Pair) fVar.m.get(str2);
                DownloadDataModel downloadDataModel4 = pair != null ? (DownloadDataModel) pair.b : null;
                if (downloadDataModel4 != null) {
                    this.e.C(downloadDataModel4);
                    this.g.h(str2);
                }
            } else {
                str2 = str;
            }
            Message message2 = new Message();
            message2.b = intExtra2;
            message2.c = str2;
            message2.d = i4;
            t32.b().j(message2);
            downloadDataModel = downloadDataModel2;
        } else {
            DownloadDataModel downloadDataModel5 = downloadDataModel3;
            i3 = 2;
            if (!this.g.c(intExtra) || downloadDataModel5 == null) {
                downloadDataModel = downloadDataModel5;
                f fVar2 = this.g;
                Pair pair2 = (Pair) fVar2.m.get(stringExtra);
                if (pair2 != null) {
                    sb7.p("PreapprovalUsageTag", "Success installation with preapproval scenario.", null);
                    a aVar = (a) fVar2.g.get();
                    DownloadDataModel downloadDataModel6 = (DownloadDataModel) pair2.b;
                    aVar.e(downloadDataModel6.a, downloadDataModel6.g);
                    fVar2.h(stringExtra);
                }
                Message message3 = new Message();
                message3.b = intExtra2;
                message3.c = stringExtra;
                message3.d = intExtra;
                t32.b().j(message3);
            } else {
                f fVar3 = this.g;
                fVar3.getClass();
                if (stringExtra != null) {
                    downloadDataModel = downloadDataModel5;
                    fVar3.m.put(stringExtra, new Pair(Integer.valueOf(intExtra), downloadDataModel));
                } else {
                    downloadDataModel = downloadDataModel5;
                }
                sb7.p("PreapprovalUsageTag", "User accept preapproval installation.", null);
                sb7.p("PreapprovalUsageTag", "Add " + stringExtra + " to preapproval map.", null);
            }
        }
        if (downloadDataModel != null && intExtra2 != -1) {
            f fVar4 = this.g;
            hx0 hx0Var = fVar4.k;
            if (hx0Var != null) {
                hx0Var.V(tx8.a);
            }
            fVar4.k = null;
        }
        stopSelf();
        return i3;
    }
}
