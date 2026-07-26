package androidx.compose.ui.semantics;

import defpackage.qp2;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final g a = new g("TestTagsAsResourceId", false, new qp2() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$TestTagsAsResourceId$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            ((Boolean) obj2).booleanValue();
            return bool;
        }
    });
    public static final g b = new g("AccessibilityClassName", true, new qp2() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$AccessibilityClassName$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return (String) obj;
        }
    });
}
