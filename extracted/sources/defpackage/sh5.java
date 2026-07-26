package defpackage;

import com.sun.jna.Function;
import com.sun.jna.Native;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class sh5 extends Function {
    public final /* synthetic */ uh5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh5(uh5 uh5Var, uh5 uh5Var2, String str) {
        super(uh5Var2, "GetLastError", 63, str);
        this.h = uh5Var;
    }

    @Override // com.sun.jna.Function
    public final Object P(Method method, Class[] clsArr, Class cls, Object[] objArr, Map map) {
        return Integer.valueOf(Native.getLastError());
    }

    @Override // com.sun.jna.Function
    public final Object Q(Object[] objArr, Class cls, boolean z, int i) {
        return Integer.valueOf(Native.getLastError());
    }
}
