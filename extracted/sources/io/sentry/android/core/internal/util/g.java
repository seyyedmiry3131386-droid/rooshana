package io.sentry.android.core.internal.util;

import io.sentry.util.AutoClosableReentrantLock;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static final g c = new g();
    public final AutoClosableReentrantLock a = new AutoClosableReentrantLock();
    public final ArrayList b = new ArrayList();

    public final ArrayList a() {
        ArrayList arrayList = this.b;
        io.sentry.r rVarA = this.a.a();
        try {
            if (!arrayList.isEmpty()) {
                rVarA.close();
                return arrayList;
            }
            File[] fileArrListFiles = new File("/sys/devices/system/cpu").listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList2 = new ArrayList();
                rVarA.close();
                return arrayList2;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String strV = io.sentry.config.a.V(new File(file, "cpufreq/cpuinfo_max_freq"));
                        if (strV != null) {
                            arrayList.add(Integer.valueOf((int) (Long.parseLong(strV.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            rVarA.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
