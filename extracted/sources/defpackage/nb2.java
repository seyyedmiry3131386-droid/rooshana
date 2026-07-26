package defpackage;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes3.dex */
public final class nb2 extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ pb2 d;

    public nb2(pb2 pb2Var, String str, boolean z, boolean z2) {
        this.d = pb2Var;
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        this.d.b(this.a, this.b, this.c);
        return null;
    }
}
