package defpackage;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class xs8 implements b18, RequestDTO, b59, u59, k71, v61, ly0, ry1, bt9, q37 {
    public static final /* synthetic */ xs8 a = new xs8();

    @Override // defpackage.u59
    public /* synthetic */ void a(w59 w59Var) {
    }

    @Override // defpackage.q37
    public void accept(Object obj, Object obj2) {
        bq9 bq9Var = (bq9) ((lx9) obj).getService();
        jn4 jn4Var = new jn4((cf8) obj2);
        bq9Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i = tm9.a;
        parcelObtain.writeStrongBinder(jn4Var);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            bq9Var.n.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // defpackage.b59
    public void b(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(new a59((ByteBuffer) obj));
    }

    @Override // defpackage.ry1
    public rz5 d(Context context, String str, qy1 qy1Var) {
        int iB;
        rz5 rz5Var = new rz5();
        int iC = qy1Var.c(context, str);
        rz5Var.a = iC;
        int i = 1;
        int i2 = 0;
        if (iC != 0) {
            iB = qy1Var.b(context, str, false);
            rz5Var.b = iB;
        } else {
            iB = qy1Var.b(context, str, true);
            rz5Var.b = iB;
        }
        int i3 = rz5Var.a;
        if (i3 == 0) {
            if (iB == 0) {
                i = 0;
            }
            rz5Var.c = i;
            return rz5Var;
        }
        i2 = i3;
        if (i2 >= iB) {
            i = -1;
        }
        rz5Var.c = i;
        return rz5Var;
    }

    @Override // defpackage.b59
    public void f(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new a59((ByteBuffer) obj));
    }

    @Override // defpackage.u59
    public /* synthetic */ void g() {
    }

    @Override // defpackage.ly0
    public /* synthetic */ Object h(o77 o77Var) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(o77Var);
    }

    @Override // defpackage.u59
    public /* synthetic */ void i() {
    }

    @Override // defpackage.u59
    public /* synthetic */ void j() {
    }

    @Override // defpackage.bt9
    public boolean o(Class cls) {
        return false;
    }

    @Override // defpackage.bt9
    public ht9 p(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }
}
