package ir.mservices.market.service;

import android.content.Intent;
import android.os.IBinder;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareAppInstallerService extends Hilt_ShareAppInstallerService {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        js3.p(intent, "intent");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0 A[Catch: all -> 0x0050, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:4:0x0023, B:9:0x004c, B:12:0x0053, B:15:0x0066, B:17:0x006c, B:19:0x0072, B:21:0x007a, B:22:0x007f, B:32:0x00a6, B:25:0x0085, B:28:0x0096, B:30:0x009b, B:31:0x00a0, B:35:0x00ac, B:37:0x00b2, B:38:0x00be, B:40:0x00d7, B:41:0x00de, B:43:0x00e0), top: B:48:0x0023 }] */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int onStartCommand(android.content.Intent r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.service.ShareAppInstallerService.onStartCommand(android.content.Intent, int, int):int");
    }
}
