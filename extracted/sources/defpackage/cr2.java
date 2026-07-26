package defpackage;

import com.google.protobuf.o;

/* JADX INFO: loaded from: classes3.dex */
public final class cr2 implements bv4 {
    public static final cr2 b = new cr2(0);
    public final /* synthetic */ int a;

    public /* synthetic */ cr2(int i) {
        this.a = i;
    }

    @Override // defpackage.bv4
    public final hv6 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!o.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (hv6) o.getDefaultInstance(cls.asSubclass(o.class)).buildMessageInfo();
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.bv4
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return o.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
