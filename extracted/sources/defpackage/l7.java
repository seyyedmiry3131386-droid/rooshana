package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class l7 extends wi5 {
    public Intent g;
    public String h;

    public static String j(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        js3.o(packageName, "getPackageName(...)");
        return m88.X(str, "${applicationId}", packageName);
    }

    @Override // defpackage.wi5
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof l7) && super.equals(obj)) {
            Intent intent = this.g;
            if ((intent != null ? intent.filterEquals(((l7) obj).g) : ((l7) obj).g == null) && js3.i(this.h, ((l7) obj).h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wi5
    public final void h(Context context, AttributeSet attributeSet) {
        super.h(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, ku6.ActivityNavigator);
        js3.o(typedArrayObtainAttributes, "obtainAttributes(...)");
        String strJ = j(context, typedArrayObtainAttributes.getString(ku6.ActivityNavigator_targetPackage));
        if (this.g == null) {
            this.g = new Intent();
        }
        Intent intent = this.g;
        js3.m(intent);
        intent.setPackage(strJ);
        String string = typedArrayObtainAttributes.getString(ku6.ActivityNavigator_android_name);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.g == null) {
                this.g = new Intent();
            }
            Intent intent2 = this.g;
            js3.m(intent2);
            intent2.setComponent(componentName);
        }
        String string2 = typedArrayObtainAttributes.getString(ku6.ActivityNavigator_action);
        if (this.g == null) {
            this.g = new Intent();
        }
        Intent intent3 = this.g;
        js3.m(intent3);
        intent3.setAction(string2);
        String strJ2 = j(context, typedArrayObtainAttributes.getString(ku6.ActivityNavigator_data));
        if (strJ2 != null) {
            Uri uri = Uri.parse(strJ2);
            if (this.g == null) {
                this.g = new Intent();
            }
            Intent intent4 = this.g;
            js3.m(intent4);
            intent4.setData(uri);
        }
        this.h = j(context, typedArrayObtainAttributes.getString(ku6.ActivityNavigator_dataPattern));
        typedArrayObtainAttributes.recycle();
    }

    @Override // defpackage.wi5
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Intent intent = this.g;
        int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.h;
        return iFilterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.wi5
    public final String toString() {
        Intent intent = this.g;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.g;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }
}
