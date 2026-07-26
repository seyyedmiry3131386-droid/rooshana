package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.FileWalkDirection;

/* JADX INFO: loaded from: classes3.dex */
public final class fq1 extends s0 {
    public final /* synthetic */ int c = 1;
    public final Object d;
    public final Object e;

    public fq1(gq1 gq1Var) {
        this.e = gq1Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.d = arrayDeque;
        File file = (File) gq1Var.b;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (!file.isFile()) {
            this.a = 2;
        } else {
            js3.p(file, "rootFile");
            arrayDeque.push(new wb2(file));
        }
    }

    @Override // defpackage.s0
    public final void a() {
        File file;
        File fileA;
        switch (this.c) {
            case 0:
                Iterator it = (Iterator) this.d;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((HashSet) this.e).add(next)) {
                        this.b = next;
                        this.a = 1;
                        break;
                    }
                }
                this.a = 2;
                break;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.d;
                while (true) {
                    yb2 yb2Var = (yb2) arrayDeque.peek();
                    if (yb2Var == null) {
                        file = null;
                    } else {
                        fileA = yb2Var.a();
                        if (fileA == null) {
                            arrayDeque.pop();
                        } else if (!fileA.equals(yb2Var.a) && fileA.isDirectory() && arrayDeque.size() < Integer.MAX_VALUE) {
                            arrayDeque.push(b(fileA));
                        }
                    }
                }
                file = fileA;
                if (file == null) {
                    this.a = 2;
                } else {
                    this.b = file;
                    this.a = 1;
                }
                break;
        }
    }

    public ub2 b(File file) {
        int iOrdinal = ((FileWalkDirection) ((gq1) this.e).c).ordinal();
        if (iOrdinal == 0) {
            js3.p(file, "rootDir");
            return new xb2(file);
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        js3.p(file, "rootDir");
        return new vb2(file);
    }

    public fq1(Iterator it, v27 v27Var) {
        js3.p(it, "source");
        this.d = it;
        this.e = new HashSet();
    }
}
