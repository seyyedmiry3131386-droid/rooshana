package ir.mservices.market.core;

import android.R;
import android.app.ActivityOptions;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import ir.mservices.market.activity.BaseActivity;

/* JADX INFO: loaded from: classes3.dex */
public class ActivitySenderReceiver extends BroadcastReceiver {
    public final BaseActivity a;
    public final IntentFilter b = new IntentFilter();

    public ActivitySenderReceiver(BaseActivity baseActivity) {
        this.a = baseActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("ir.mservices.market.action.FINISH_ALL_ACTIVITIES".equals(intent.getAction())) {
            BaseActivity baseActivity = this.a;
            baseActivity.finish();
            if (baseActivity instanceof BaseDialogActivity) {
                return;
            }
            Intent intent2 = new Intent(baseActivity, baseActivity.getClass());
            intent2.addFlags(268435456);
            ContextCompat.startActivity(context, intent2, ActivityOptions.makeCustomAnimation(baseActivity, R.anim.fade_in, R.anim.fade_out).toBundle());
        }
    }
}
