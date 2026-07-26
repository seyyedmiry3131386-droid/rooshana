package androidx.fragment.app;

import androidx.activity.result.ActivityResult;
import defpackage.r7;
import defpackage.wl2;
import io.sentry.android.core.t0;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements r7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ e(wl2 wl2Var, int i) {
        this.a = i;
        this.b = wl2Var;
    }

    @Override // defpackage.r7
    public final void g(Object obj) {
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                g gVar = this.b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) gVar.G.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo == null) {
                    t0.m("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = fragmentManager$LaunchedFragmentInfo.a;
                    if (gVar.c.E(str) == null) {
                        t0.m("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            case 1:
                ActivityResult activityResult = (ActivityResult) obj;
                g gVar2 = this.b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) gVar2.G.pollLast();
                if (fragmentManager$LaunchedFragmentInfo2 == null) {
                    t0.m("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = fragmentManager$LaunchedFragmentInfo2.a;
                    int i2 = fragmentManager$LaunchedFragmentInfo2.b;
                    d dVarE = gVar2.c.E(str2);
                    if (dVarE == null) {
                        t0.m("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        dVarE.U(i2, activityResult.a, activityResult.b);
                    }
                }
                break;
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                g gVar3 = this.b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) gVar3.G.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo3 == null) {
                    t0.m("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = fragmentManager$LaunchedFragmentInfo3.a;
                    int i3 = fragmentManager$LaunchedFragmentInfo3.b;
                    d dVarE2 = gVar3.c.E(str3);
                    if (dVarE2 == null) {
                        t0.m("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        dVarE2.U(i3, activityResult2.a, activityResult2.b);
                    }
                }
                break;
        }
    }
}
