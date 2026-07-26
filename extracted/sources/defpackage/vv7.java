package defpackage;

import android.graphics.Rect;
import androidx.window.core.VerificationMode;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class vv7 {
    public static final /* synthetic */ int b = 0;
    public final VerificationMode a = VerificationMode.a;

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (js3.i(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return js3.i(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list != null && list2 != null && list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (a((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean e(SidecarDisplayFeature sidecarDisplayFeature) {
        js3.p(sidecarDisplayFeature, "$this$require");
        return sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2;
    }

    public static final boolean f(SidecarDisplayFeature sidecarDisplayFeature) {
        js3.p(sidecarDisplayFeature, "$this$require");
        return (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true;
    }

    public static final boolean g(SidecarDisplayFeature sidecarDisplayFeature) {
        js3.p(sidecarDisplayFeature, "$this$require");
        return sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0;
    }

    public static final boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        js3.p(sidecarDisplayFeature, "$this$require");
        return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
    }

    public final xf9 c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new xf9(EmptyList.a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        uv7.d(sidecarDeviceState2, uv7.b(sidecarDeviceState));
        return new xf9(d(uv7.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        js3.p(list, "sidecarDisplayFeatures");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ex2 ex2VarI = i((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (ex2VarI != null) {
                arrayList.add(ex2VarI);
            }
        }
        return arrayList;
    }

    public final ex2 i(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        dx2 dx2Var;
        ch2 ch2Var;
        js3.p(sidecarDisplayFeature, "feature");
        fz1 fz1Var = fz1.b;
        VerificationMode verificationMode = this.a;
        js3.p(verificationMode, "verificationMode");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new v29(sidecarDisplayFeature, verificationMode, fz1Var).k("Type must be either TYPE_FOLD or TYPE_HINGE", new qv7()).k("Feature bounds must not be 0", new rv7()).k("TYPE_FOLD must have 0 area", new sv7()).k("Feature be pinned to either left or top", new tv7()).b();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            dx2Var = dx2.c;
        } else {
            if (type != 2) {
                return null;
            }
            dx2Var = dx2.d;
        }
        int iB = uv7.b(sidecarDeviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB != 2) {
            ch2Var = ch2.c;
            if (iB != 3 && iB == 4) {
                return null;
            }
        } else {
            ch2Var = ch2.d;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        js3.o(rect, "getRect(...)");
        return new ex2(new uf0(rect), dx2Var, ch2Var);
    }
}
