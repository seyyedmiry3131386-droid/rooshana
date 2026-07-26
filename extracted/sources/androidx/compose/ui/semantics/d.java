package androidx.compose.ui.semantics;

import defpackage.gc2;
import defpackage.qp2;
import defpackage.s41;
import defpackage.tf;
import defpackage.tx8;
import defpackage.v97;
import defpackage.xr7;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final g a = new g("ContentDescription", true, new qp2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list == null) {
                return list2;
            }
            ArrayList arrayListQ0 = kotlin.collections.a.Q0(list);
            arrayListQ0.addAll(list2);
            return arrayListQ0;
        }
    });
    public static final g b = new g("StateDescription", 0);
    public static final g c = new g("ProgressBarRangeInfo", 0);
    public static final g d = new g("PaneTitle", true, new qp2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });
    public static final g e = new g("SelectableGroup", 0);
    public static final g f = new g("CollectionInfo", 0);
    public static final g g = new g("CollectionItemInfo", 0);
    public static final g h = new g("Heading", 0);
    public static final g i = new g("Disabled", 0);
    public static final g j = new g("LiveRegion", 0);
    public static final g k = new g("Focused", 0);
    public static final g l = new g("IsContainer", 0);
    public static final g m = new g("IsTraversalGroup");
    public static final g n = new g("IsSensitiveData");
    public static final g o = new g("InvisibleToUser", new qp2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return (tx8) obj;
        }
    });
    public static final g p = new g("HideFromAccessibility", new qp2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$HideFromAccessibility$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return (tx8) obj;
        }
    });
    public static final g q = new g("ContentType", new qp2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentType$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return (s41) obj;
        }
    });
    public static final g r = new g("ContentDataType", new qp2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDataType$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return (tf) obj;
        }
    });
    public static final g s = new g("FillableData", new qp2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$FillableData$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return (gc2) obj;
        }
    });
    public static final g t = new g("TraversalIndex", new qp2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TraversalIndex$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Float f2 = (Float) obj;
            ((Number) obj2).floatValue();
            return f2;
        }
    });
    public static final g u = new g("HorizontalScrollAxisRange", 0);
    public static final g v = new g("VerticalScrollAxisRange", 0);
    public static final g w = new g("IsPopup", true, new qp2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });
    public static final g x = new g("IsDialog", true, new qp2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    });
    public static final g y = new g("Role", true, new qp2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            v97 v97Var = (v97) obj;
            int i2 = ((v97) obj2).a;
            return v97Var;
        }
    });
    public static final g z = new g("TestTag", false, new qp2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return (String) obj;
        }
    });
    public static final g A = new g("LinkTestMarker", false, new qp2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$LinkTestMarker$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return (tx8) obj;
        }
    });
    public static final g B = new g("Text", true, new qp2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list == null) {
                return list2;
            }
            ArrayList arrayListQ0 = kotlin.collections.a.Q0(list);
            arrayListQ0.addAll(list2);
            return arrayListQ0;
        }
    });
    public static final g C = new g("TextSubstitution");
    public static final g D = new g("IsShowingTextSubstitution");
    public static final g E = new g("InputText", 0);
    public static final g F = new g("EditableText", 0);
    public static final g G = new g("TextSelectionRange", 0);
    public static final g H = new g("ImeAction", 0);
    public static final g I = new g("Selected", 0);
    public static final g J = new g("ToggleableState", 0);
    public static final g K = new g("Password", 0);
    public static final g L = new g("Error", 0);
    public static final g M = new g("IndexForKey");
    public static final g N = new g("IsEditable");
    public static final g O = new g("MaxTextLength");
    public static final g P = new g("Shape", false, new qp2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Shape$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return (xr7) obj;
        }
    });
}
