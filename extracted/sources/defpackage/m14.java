package defpackage;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class m14 {
    public static final tj1 a = yh0.c();

    public static final Owner a(h hVar) {
        Owner owner = hVar.p;
        if (owner != null) {
            return owner;
        }
        throw t61.r("LayoutNode should be attached to an owner");
    }
}
