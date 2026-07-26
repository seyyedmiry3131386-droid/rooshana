package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class xl1 {
    public final Executor a;
    public final cl6 b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public am1[] g;
    public byte[] h;

    public xl1(AssetManager assetManager, Executor executor, cl6 cl6Var, String str, File file) {
        this.a = executor;
        this.b = cl6Var;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24) {
            if (i < 31) {
                switch (i) {
                    case 24:
                    case 25:
                        bArr = is3.g;
                        break;
                    case 26:
                        bArr = is3.f;
                        break;
                    case 27:
                        bArr = is3.e;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = is3.d;
                        break;
                }
            } else {
                bArr = is3.c;
            }
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.a.execute(new cy0(this, i, serializable, 2));
    }
}
