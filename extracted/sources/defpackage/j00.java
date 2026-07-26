package defpackage;

import com.google.android.material.datepicker.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j00(int i, long j, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                b62 b62Var = ((n00) obj).c;
                String str = j29.a;
                hd1 hd1Var = b62Var.a.s;
                be beVarA0 = hd1Var.a0();
                hd1Var.b0(beVarA0, 1010, new dd1(j, beVarA0));
                break;
            default:
                g gVar = (g) obj;
                gVar.a.setError(String.format(gVar.e, jr9.j(j).replace(' ', (char) 160)));
                gVar.a();
                break;
        }
    }
}
