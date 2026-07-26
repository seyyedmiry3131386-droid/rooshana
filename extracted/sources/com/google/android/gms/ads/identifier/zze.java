package com.google.android.gms.ads.identifier;

import defpackage.dw1;
import io.sentry.android.core.t0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class zze {
    public static final void zza(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    t0.m("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + str);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            e = e;
            t0.n("HttpUrlPinger", dw1.o("Error while pinging URL: ", str, ". ", e.getMessage()), e);
        } catch (IndexOutOfBoundsException e2) {
            t0.n("HttpUrlPinger", dw1.o("Error while parsing ping URL: ", str, ". ", e2.getMessage()), e2);
        } catch (RuntimeException e3) {
            e = e3;
            t0.n("HttpUrlPinger", dw1.o("Error while pinging URL: ", str, ". ", e.getMessage()), e);
        }
    }
}
