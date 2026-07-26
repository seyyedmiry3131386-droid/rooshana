package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class s3 implements ta1 {
    public final Object a;

    public /* synthetic */ s3(Object obj) {
        this.a = obj;
    }

    public static s3 a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return new s3(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
    }

    @Override // defpackage.ta1
    public Object i() {
        return this.a;
    }

    @Override // defpackage.ta1
    public void c() {
    }
}
