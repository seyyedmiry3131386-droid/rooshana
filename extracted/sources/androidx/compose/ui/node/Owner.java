package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a96;
import defpackage.e30;
import defpackage.ev2;
import defpackage.go3;
import defpackage.h18;
import defpackage.he9;
import defpackage.hj8;
import defpackage.hu1;
import defpackage.i87;
import defpackage.ih2;
import defpackage.ii8;
import defpackage.l30;
import defpackage.lg2;
import defpackage.m30;
import defpackage.mn7;
import defpackage.n3;
import defpackage.oh2;
import defpackage.pt0;
import defpackage.qj1;
import defpackage.qt0;
import defpackage.uw5;
import defpackage.v69;
import defpackage.w61;
import defpackage.yw2;
import defpackage.zg6;

/* JADX INFO: loaded from: classes.dex */
public interface Owner {
    n3 getAccessibilityManager();

    e30 getAutofill();

    l30 getAutofillManager();

    m30 getAutofillTree();

    pt0 getClipboard();

    qt0 getClipboardManager();

    w61 getCoroutineContext();

    qj1 getDensity();

    hu1 getDragAndDropManager();

    lg2 getFocusOwner();

    oh2 getFontFamilyResolver();

    ih2 getFontLoader();

    ev2 getGraphicsContext();

    yw2 getHapticFeedBack();

    go3 getInputModeManager();

    LayoutDirection getLayoutDirection();

    uw5 getOutOfFrameExecutor();

    a96 getPlacementScope();

    zg6 getPointerIconService();

    androidx.compose.ui.spatial.a getRectManager();

    i87 getRetainedValuesStore();

    h getRoot();

    mn7 getSemanticsOwner();

    i getSharedDrawScope();

    boolean getShowLayoutBounds();

    p getSnapshotObserver();

    h18 getSoftwareKeyboardController();

    ii8 getTextInputService();

    hj8 getTextToolbar();

    v69 getViewConfiguration();

    he9 getWindowInfo();

    void setShowLayoutBounds(boolean z);
}
