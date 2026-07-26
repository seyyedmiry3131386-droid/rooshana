package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class d69 extends ah4 {
    public final /* synthetic */ int e;

    public d69(int i, Class cls, int i2, int i3, int i4) {
        this.e = i4;
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }

    @Override // defpackage.ah4
    public final Object c(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(l69.c(view));
            case 1:
                return l69.a(view);
            case 2:
                return n69.b(view);
            default:
                return Boolean.valueOf(l69.b(view));
        }
    }

    @Override // defpackage.ah4
    public final void d(View view, Object obj) {
        switch (this.e) {
            case 0:
                l69.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                l69.e(view, (CharSequence) obj);
                break;
            case 2:
                n69.d(view, (CharSequence) obj);
                break;
            default:
                l69.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.ah4
    public final boolean g(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }
}
