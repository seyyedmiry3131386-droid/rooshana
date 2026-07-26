package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bz implements vb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ bz(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.vb8
    public final Object get() {
        td1 td1Var;
        switch (this.a) {
            case 0:
                return fz.i(this.b);
            case 1:
                return new qg1(this.b);
            case 2:
                return new ig1(new do3(this.b, 21), new pe1());
            case 3:
                return new ci1(this.b);
            default:
                Context context = this.b;
                ImmutableList immutableList = td1.p;
                synchronized (td1.class) {
                    try {
                        if (td1.v == null) {
                            Context applicationContext = context == null ? null : context.getApplicationContext();
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            map.put(2, -9223372036854775807L);
                            map.put(3, -9223372036854775807L);
                            map.put(4, -9223372036854775807L);
                            map.put(5, -9223372036854775807L);
                            map.put(10, -9223372036854775807L);
                            map.put(9, -9223372036854775807L);
                            map.put(7, -9223372036854775807L);
                            td1.v = new td1(applicationContext, map);
                        }
                        td1Var = td1.v;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return td1Var;
        }
    }
}
