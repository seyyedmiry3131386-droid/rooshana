package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class gb2 implements la1 {
    public final String a;
    public final AssetManager b;
    public Object c;
    public final /* synthetic */ int d;

    public gb2(AssetManager assetManager, String str, int i) {
        this.d = i;
        this.b = assetManager;
        this.a = str;
    }

    @Override // defpackage.la1
    public final void c() {
        Object obj = this.c;
        if (obj == null) {
            return;
        }
        try {
            switch (this.d) {
                case 0:
                    ((AssetFileDescriptor) obj).close();
                    break;
                default:
                    ((InputStream) obj).close();
                    break;
            }
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.la1
    public final DataSource d() {
        return DataSource.a;
    }

    @Override // defpackage.la1
    public final void e(Priority priority, ka1 ka1Var) {
        Object objOpenFd;
        try {
            AssetManager assetManager = this.b;
            String str = this.a;
            switch (this.d) {
                case 0:
                    objOpenFd = assetManager.openFd(str);
                    break;
                default:
                    objOpenFd = assetManager.open(str);
                    break;
            }
            this.c = objOpenFd;
            ka1Var.f(objOpenFd);
        } catch (IOException e) {
            ka1Var.a(e);
        }
    }

    @Override // defpackage.la1
    public final Class getDataClass() {
        switch (this.d) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.la1
    public final void cancel() {
    }
}
