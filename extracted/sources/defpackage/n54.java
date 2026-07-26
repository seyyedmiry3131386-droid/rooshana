package defpackage;

import com.sun.jna.Function;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class n54 {
    public final Function a;
    public final boolean b;
    public final Object c;
    public final HashMap d;
    public final Class[] e;

    public n54(Object obj) {
        this.a = null;
        this.b = false;
        this.d = null;
        this.e = null;
        this.c = obj;
    }

    public n54(Function function, Class[] clsArr, boolean z, HashMap map) {
        this.a = function;
        this.b = z;
        this.d = map;
        this.e = clsArr;
        this.c = null;
    }
}
