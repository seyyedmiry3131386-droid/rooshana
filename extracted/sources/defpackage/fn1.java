package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class fn1 extends wi5 implements ve2 {
    public String g;

    @Override // defpackage.wi5
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof fn1) && super.equals(obj) && js3.i(this.g, ((fn1) obj).g);
    }

    @Override // defpackage.wi5
    public final void h(Context context, AttributeSet attributeSet) {
        super.h(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, qt6.DialogFragmentNavigator);
        js3.o(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(qt6.DialogFragmentNavigator_android_name);
        if (string != null) {
            this.g = string;
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // defpackage.wi5
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
