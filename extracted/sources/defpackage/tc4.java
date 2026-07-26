package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class tc4 implements la1 {
    public final boolean a;
    public final Uri b;
    public final ContentResolver c;
    public Object d;

    public tc4(ContentResolver contentResolver, Uri uri, boolean z) {
        this.c = contentResolver;
        this.b = uri;
        this.a = z;
    }

    public abstract void a(Object obj);

    public abstract Object b(ContentResolver contentResolver, Uri uri);

    @Override // defpackage.la1
    public final void c() {
        Object obj = this.d;
        if (obj != null) {
            try {
                a(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.la1
    public final DataSource d() {
        return DataSource.a;
    }

    @Override // defpackage.la1
    public final void e(Priority priority, ka1 ka1Var) {
        try {
            Object objB = b(this.c, this.b);
            this.d = objB;
            ka1Var.f(objB);
        } catch (FileNotFoundException e) {
            ka1Var.a(e);
        }
    }

    @Override // defpackage.la1
    public final void cancel() {
    }
}
