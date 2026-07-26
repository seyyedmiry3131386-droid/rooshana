package defpackage;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke;
import androidx.datastore.preferences.protobuf.f;

/* JADX INFO: loaded from: classes.dex */
public final class dr2 implements cv4 {
    public static final dr2 b = new dr2(0);
    public final /* synthetic */ int a;

    public /* synthetic */ dr2(int i) {
        this.a = i;
    }

    @Override // defpackage.cv4
    public final iv6 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!f.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (iv6) f.d(cls.asSubclass(f.class)).c(GeneratedMessageLite$MethodToInvoke.c);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.cv4
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return f.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
