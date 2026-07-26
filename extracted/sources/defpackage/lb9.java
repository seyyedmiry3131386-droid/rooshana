package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import ir.myket.vpn.state.Command;
import ir.myket.vpn.vpn.VpnManagerService;

/* JADX INFO: loaded from: classes3.dex */
public final class lb9 implements kb9 {
    public static void a(Context context, Command command) {
        Intent intent = new Intent(context, (Class<?>) VpnManagerService.class);
        intent.putExtra("DNS_SERVERS", command);
        Object e87Var = Build.VERSION.SDK_INT >= 26 ? new e87(context.startForegroundService(intent)) : new d87();
        if (e87Var instanceof d87) {
            context.startService(intent);
        }
    }
}
