package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.a;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class ec0 implements j67 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ec0(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.j67
    public final g67 a(Object obj, int i, int i2, sv5 sv5Var) {
        boolean z;
        a aVar;
        k42 k42Var;
        switch (this.a) {
            case 0:
                g67 g67VarA = ((j67) this.b).a(obj, i, i2, sv5Var);
                Resources resources = (Resources) this.c;
                if (g67VarA == null) {
                    return null;
                }
                return new qc0(resources, g67VarA);
            case 1:
                g67 g67VarC = ((l67) this.b).c((Uri) obj, sv5Var);
                if (g67VarC == null) {
                    return null;
                }
                return c26.q((pc0) this.c, (Drawable) ((os2) g67VarC).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof a) {
                    aVar = (a) inputStream;
                    z = false;
                } else {
                    z = true;
                    aVar = new a(inputStream, (dr3) this.c);
                }
                ArrayDeque arrayDeque = k42.c;
                synchronized (arrayDeque) {
                    k42Var = (k42) arrayDeque.poll();
                    break;
                }
                if (k42Var == null) {
                    k42Var = new k42();
                }
                k42 k42Var2 = k42Var;
                k42Var2.a = aVar;
                j1 j1Var = new j1(k42Var2);
                bn6 bn6Var = new bn6(aVar, k42Var2, 8);
                try {
                    yt1 yt1Var = (yt1) this.b;
                    qc0 qc0VarA = yt1Var.a(new pa2(j1Var, yt1Var.d, yt1Var.c), i, i2, sv5Var, bn6Var);
                    k42Var2.b();
                    if (z) {
                        aVar.d();
                    }
                    return qc0VarA;
                } finally {
                }
        }
    }

    @Override // defpackage.j67
    public final boolean b(Object obj, sv5 sv5Var) {
        switch (this.a) {
            case 0:
                return ((j67) this.b).b(obj, sv5Var);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((yt1) this.b).getClass();
                return true;
        }
    }

    public ec0(Resources resources, j67 j67Var) {
        this.a = 0;
        this.c = resources;
        this.b = j67Var;
    }
}
