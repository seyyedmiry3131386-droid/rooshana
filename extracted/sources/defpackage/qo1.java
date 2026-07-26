package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class qo1 implements la1 {
    public final Resources.Theme a;
    public final Resources b;
    public final po1 c;
    public final int d;
    public Object e;

    public qo1(Resources.Theme theme, Resources resources, po1 po1Var, int i) {
        this.a = theme;
        this.b = resources;
        this.c = po1Var;
        this.d = i;
    }

    @Override // defpackage.la1
    public final void c() {
        Object obj = this.e;
        if (obj != null) {
            try {
                switch (this.c.a) {
                    case 0:
                        ((AssetFileDescriptor) obj).close();
                        break;
                    case 1:
                        break;
                    default:
                        ((InputStream) obj).close();
                        break;
                }
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
        Object objOpenRawResourceFd;
        try {
            po1 po1Var = this.c;
            Resources.Theme theme = this.a;
            Resources resources = this.b;
            int i = this.d;
            switch (po1Var.a) {
                case 0:
                    objOpenRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 1:
                    Context context = po1Var.b;
                    objOpenRawResourceFd = m91.t(context, context, i, theme);
                    break;
                default:
                    objOpenRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.e = objOpenRawResourceFd;
            ka1Var.f(objOpenRawResourceFd);
        } catch (Resources.NotFoundException e) {
            ka1Var.a(e);
        }
    }

    @Override // defpackage.la1
    public final Class getDataClass() {
        switch (this.c.a) {
            case 0:
                return AssetFileDescriptor.class;
            case 1:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.la1
    public final void cancel() {
    }
}
