package defpackage;

import java.util.ArrayList;
import kotlin.collections.a;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zp3 {
    public final va0 a;

    public zp3(va0 va0Var) {
        this.a = va0Var;
    }

    public Object a(ry0 ry0Var) throws InstanceCreationException {
        av avVar = (av) ry0Var.a;
        StringBuilder sb = new StringBuilder("| (+) '");
        va0 va0Var = this.a;
        sb.append(va0Var);
        sb.append('\'');
        avVar.t(sb.toString());
        try {
            b26 b26Var = (b26) ry0Var.e;
            if (b26Var == null) {
                b26Var = new b26(3, null);
            }
            return va0Var.d.invoke((lf7) ry0Var.b, b26Var);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e);
            sb2.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            js3.o(stackTrace, "getStackTrace(...)");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                js3.o(className, "getClassName(...)");
                if (f88.c0(className, "sun.reflect", false)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb2.append(a.t0(arrayList, "\n\t", null, null, null, 62));
            String str = "* Instance creation error : could not create instance for '" + va0Var + "': " + sb2.toString();
            js3.p(str, "msg");
            avVar.x(Level.d, str);
            String str2 = "Could not create instance for '" + va0Var + '\'';
            js3.p(str2, "msg");
            throw new InstanceCreationException(str2, e);
        }
    }

    public abstract Object b(ry0 ry0Var);
}
