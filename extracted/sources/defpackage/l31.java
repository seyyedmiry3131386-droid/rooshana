package defpackage;

import android.view.contentcapture.ContentCaptureSession;
import com.google.gson.internal.LinkedTreeMap;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l31 implements qq5, yp2, q94, r94 {
    public final /* synthetic */ int a;

    public /* synthetic */ l31(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession b(Object obj) {
        return (ContentCaptureSession) obj;
    }

    @Override // defpackage.qq5
    public Object a() {
        switch (this.a) {
            case 0:
                return new ConcurrentHashMap();
            case 1:
                return new ConcurrentSkipListMap();
            case 2:
                return new ArrayList();
            case 3:
                return new LinkedHashSet();
            case 4:
                return new TreeSet();
            case 5:
                return new ArrayDeque();
            default:
                return new LinkedTreeMap();
        }
    }

    @Override // defpackage.yp2
    public Object apply(Object obj) {
        switch (this.a) {
            case 8:
                return Integer.valueOf(((l81) obj).r);
            default:
                long j = ((o81) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
        }
    }

    @Override // defpackage.r94
    public void d(Object obj, vd2 vd2Var) {
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        ce ceVar = (ce) obj;
        switch (this.a) {
            case 10:
                ceVar.getClass();
                break;
            case 11:
                ceVar.getClass();
                break;
            case 12:
                ceVar.getClass();
                break;
            case 13:
            default:
                ceVar.getClass();
                break;
            case 14:
                ceVar.getClass();
                break;
            case 15:
                ceVar.getClass();
                break;
            case 16:
                ceVar.getClass();
                break;
            case 17:
                ceVar.getClass();
                break;
            case 18:
                ceVar.getClass();
                break;
            case 19:
                ceVar.getClass();
                break;
            case 20:
                ceVar.getClass();
                break;
            case 21:
                ceVar.getClass();
                break;
            case 22:
                ceVar.getClass();
                break;
            case 23:
                ceVar.getClass();
                break;
            case 24:
                ceVar.getClass();
                break;
            case 25:
                ceVar.getClass();
                break;
            case 26:
                ceVar.getClass();
                break;
            case 27:
                ceVar.getClass();
                break;
            case 28:
                ceVar.getClass();
                break;
        }
    }

    public /* synthetic */ l31(be beVar) {
        this.a = 16;
    }

    public /* synthetic */ l31(be beVar, int i, boolean z) {
        this.a = 19;
    }

    public /* synthetic */ l31(be beVar, long j, int i, byte b) {
        this.a = i;
    }

    public /* synthetic */ l31(be beVar, da4 da4Var, op4 op4Var, int i) {
        this.a = 18;
    }

    public /* synthetic */ l31(be beVar, da4 da4Var, op4 op4Var, int i, byte b) {
        this.a = i;
    }

    public /* synthetic */ l31(be beVar, Object obj, int i) {
        this.a = i;
    }

    public /* synthetic */ l31(be beVar, boolean z, int i) {
        this.a = 12;
    }
}
