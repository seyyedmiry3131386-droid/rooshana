package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zx0 implements ct5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ zx0(ComponentActivity componentActivity, int i) {
        this.a = i;
        this.b = componentActivity;
    }

    @Override // defpackage.ct5
    public final void a(ComponentActivity componentActivity) {
        int i = this.a;
        ComponentActivity componentActivity2 = this.b;
        switch (i) {
            case 0:
                int i2 = ComponentActivity.u;
                js3.p(componentActivity, "it");
                Bundle bundleO = ((bn6) componentActivity2.d.c).o("android:support:activity-result");
                if (bundleO != null) {
                    dy0 dy0Var = componentActivity2.i;
                    LinkedHashMap linkedHashMap = dy0Var.b;
                    LinkedHashMap linkedHashMap2 = dy0Var.a;
                    Bundle bundle = dy0Var.g;
                    ArrayList<Integer> integerArrayList = bundleO.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleO.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleO.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            dy0Var.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleO.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            String str = stringArrayList.get(i3);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    wu8.h(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i3);
                            js3.o(num2, "get(...)");
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i3);
                            js3.o(str2, "get(...)");
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            dy0Var.b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                tk2 tk2Var = (tk2) ((FragmentActivity) componentActivity2).v.b;
                tk2Var.v.b(tk2Var, tk2Var, null);
                break;
        }
    }
}
