package defpackage;

import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.android.gms.internal.measurement.zzoh;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class js9 implements ct9 {
    public final q0 a;
    public q0 b;

    public js9(q0 q0Var) {
        this.a = q0Var;
        if (q0Var.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = (q0) q0Var.o(4);
    }

    public static void a(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    public final void b() {
        if (this.b.e()) {
            return;
        }
        q0 q0Var = (q0) this.a.o(4);
        ft9.c.a(q0Var.getClass()).a(q0Var, this.b);
        this.b = q0Var;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final js9 clone() {
        js9 js9Var = (js9) this.a.o(5);
        js9Var.b = d();
        return js9Var;
    }

    public final q0 d() {
        if (!this.b.e()) {
            return this.b;
        }
        this.b.g();
        return this.b;
    }

    public final q0 e() {
        q0 q0VarD = d();
        q0VarD.getClass();
        boolean zC = true;
        byte bByteValue = ((Byte) q0VarD.o(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zC = false;
            } else {
                zC = ft9.c.a(q0VarD.getClass()).c(q0VarD);
                q0VarD.o(2);
            }
        }
        if (zC) {
            return q0VarD;
        }
        throw new zzoh("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void f(q0 q0Var) {
        q0 q0Var2 = this.a;
        if (q0Var2.equals(q0Var)) {
            return;
        }
        if (!this.b.e()) {
            q0 q0Var3 = (q0) q0Var2.o(4);
            ft9.c.a(q0Var3.getClass()).a(q0Var3, this.b);
            this.b = q0Var3;
        }
        q0 q0Var4 = this.b;
        ft9.c.a(q0Var4.getClass()).a(q0Var4, q0Var);
    }

    public final void g(byte[] bArr, int i, es9 es9Var) throws zzmr {
        if (!this.b.e()) {
            q0 q0Var = (q0) this.a.o(4);
            ft9.c.a(q0Var.getClass()).a(q0Var, this.b);
            this.b = q0Var;
        }
        try {
            it9 it9VarA = ft9.c.a(this.b.getClass());
            q0 q0Var2 = this.b;
            wr9 wr9Var = new wr9();
            es9Var.getClass();
            it9VarA.h(q0Var2, bArr, 0, i, wr9Var);
        } catch (zzmr e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
