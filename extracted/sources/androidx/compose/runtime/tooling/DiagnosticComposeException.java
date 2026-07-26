package androidx.compose.runtime.tooling;

import defpackage.br9;
import defpackage.c26;
import defpackage.fz0;
import defpackage.gj4;
import defpackage.gz0;
import defpackage.js3;
import java.util.ArrayList;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticComposeException extends RuntimeException {
    public final fz0 a;

    public DiagnosticComposeException(fz0 fz0Var) {
        this.a = fz0Var;
        if (fz0Var.a()) {
            return;
        }
        ArrayList arrayListS = c26.s(fz0Var);
        int size = arrayListS.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
        for (int i = 0; i < size; i++) {
            stackTraceElementArr[i] = new StackTraceElement("$$compose", "m$" + ((gz0) arrayListS.get(i)).a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        fz0 fz0Var = this.a;
        if (!fz0Var.a()) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        int i = 0;
        if (fz0Var.a()) {
            ListBuilder listBuilderS = br9.s();
            gj4 gj4VarD0 = a.d0(fz0Var.a);
            int iA = gj4VarD0.a();
            for (int i2 = 0; i2 < iA; i2++) {
                ((gz0) gj4VarD0.get(i2)).getClass();
            }
            gj4 gj4VarD02 = a.d0(br9.q(listBuilderS));
            int iA2 = gj4VarD02.a();
            while (i < iA2) {
                String str = (String) gj4VarD02.get(i);
                sb.append("\tat ");
                sb.append(str);
                sb.append('\n');
                i++;
            }
        } else {
            ArrayList arrayListS = c26.s(fz0Var);
            int size = arrayListS.size();
            while (i < size) {
                gz0 gz0Var = (gz0) arrayListS.get(i);
                sb.append("\tat $$compose.m$");
                sb.append(gz0Var.a);
                sb.append("(SourceFile:1)\n");
                i++;
            }
        }
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }
}
