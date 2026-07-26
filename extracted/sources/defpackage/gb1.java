package defpackage;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.Priority;
import com.bumptech.glide.a;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class gb1 implements la1 {
    public final /* synthetic */ int a;
    public final Comparable b;
    public final Object c;
    public Object d;

    public /* synthetic */ gb1(Comparable comparable, Object obj, int i) {
        this.a = i;
        this.b = comparable;
        this.c = obj;
    }

    public static gb1 a(Context context, Uri uri, gl8 gl8Var) {
        return new gb1(uri, new vp7(a.a(context).c.b().f(), gl8Var, a.a(context).d, context.getContentResolver(), 6), 2);
    }

    @Override // defpackage.la1
    public final void c() {
        switch (this.a) {
            case 0:
                try {
                    ((ByteArrayInputStream) this.d).close();
                } catch (IOException unused) {
                    return;
                }
                break;
            case 1:
                Object obj = this.d;
                if (obj != null) {
                    try {
                        ((mb2) this.c).u(obj);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // defpackage.la1
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.la1
    public final DataSource d() {
        switch (this.a) {
        }
        return DataSource.a;
    }

    @Override // defpackage.la1
    public final void e(Priority priority, ka1 ka1Var) throws Throwable {
        switch (this.a) {
            case 0:
                try {
                    ByteArrayInputStream byteArrayInputStreamV = av.v((String) this.b);
                    this.d = byteArrayInputStreamV;
                    ka1Var.f(byteArrayInputStreamV);
                } catch (IllegalArgumentException e) {
                    ka1Var.a(e);
                    return;
                }
                break;
            case 1:
                try {
                    Object objJ = ((mb2) this.c).j((File) this.b);
                    this.d = objJ;
                    ka1Var.f(objJ);
                } catch (FileNotFoundException e2) {
                    ka1Var.a(e2);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamH = h();
                    this.d = inputStreamH;
                    ka1Var.f(inputStreamH);
                } catch (FileNotFoundException e3) {
                    ka1Var.a(e3);
                }
                break;
        }
    }

    @Override // defpackage.la1
    public final Class getDataClass() {
        switch (this.a) {
            case 0:
                ((av) this.c).getClass();
                return InputStream.class;
            case 1:
                return ((mb2) this.c).getDataClass();
            default:
                return InputStream.class;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.InputStream h() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb1.h():java.io.InputStream");
    }

    private final void b() {
    }

    private final void f() {
    }

    private final void g() {
    }
}
