package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uy0 implements tp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ uy0(int i) {
        this.a = i;
    }

    @Override // defpackage.tp2
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                mg8 mg8Var = (mg8) obj;
                ag8 ag8Var = (ag8) obj2;
                bp2 bp2Var = (bp2) obj3;
                qz0 qz0Var = (qz0) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    i = ((iIntValue & 8) == 0 ? qz0Var.f(mg8Var) : qz0Var.h(mg8Var) ? 4 : 2) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= (iIntValue & 64) == 0 ? qz0Var.f(ag8Var) : qz0Var.h(ag8Var) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i |= qz0Var.h(bp2Var) ? 256 : 128;
                }
                if (qz0Var.R(i & 1, (i & 1171) != 1170)) {
                    oh1.c(mg8Var, ag8Var, bp2Var, qz0Var, i & 1022);
                } else {
                    qz0Var.U();
                }
                break;
            case 1:
                mg8 mg8Var2 = (mg8) obj;
                ag8 ag8Var2 = (ag8) obj2;
                bp2 bp2Var2 = (bp2) obj3;
                qz0 qz0Var2 = (qz0) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i2 = ((iIntValue2 & 8) == 0 ? qz0Var2.f(mg8Var2) : qz0Var2.h(mg8Var2) ? 4 : 2) | iIntValue2;
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= (iIntValue2 & 64) == 0 ? qz0Var2.f(ag8Var2) : qz0Var2.h(ag8Var2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= qz0Var2.h(bp2Var2) ? 256 : 128;
                }
                if (qz0Var2.R(i2 & 1, (i2 & 1171) != 1170)) {
                    oh1.c(mg8Var2, ag8Var2, bp2Var2, qz0Var2, i2 & 1022);
                } else {
                    qz0Var2.U();
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((zi8) obj5).a;
                String string = ((CharSequence) obj4).subSequence(zi8.g(j), zi8.f(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return tx8.a;
    }
}
