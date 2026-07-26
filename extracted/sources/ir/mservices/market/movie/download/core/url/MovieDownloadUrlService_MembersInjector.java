package ir.mservices.market.movie.download.core.url;

import android.content.Context;
import defpackage.bp7;
import defpackage.c5;
import defpackage.d04;
import defpackage.et4;
import defpackage.fw4;
import defpackage.i10;
import defpackage.lu7;
import defpackage.on6;
import defpackage.qu2;
import defpackage.x57;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieDownloadUrlService_MembersInjector implements et4 {
    private final on6 accountManagerProvider;
    private final on6 authorizationManagerProvider;
    private final on6 contextProvider;
    private final on6 googleUtilsProvider;
    private final on6 languageHelperProvider;
    private final on6 miuiUtilsProvider;
    private final on6 requestProxyProvider;
    private final on6 serverMonitorProvider;
    private final on6 sharedPreferencesProxyProvider;

    private MovieDownloadUrlService_MembersInjector(on6 on6Var, on6 on6Var2, on6 on6Var3, on6 on6Var4, on6 on6Var5, on6 on6Var6, on6 on6Var7, on6 on6Var8, on6 on6Var9) {
        this.languageHelperProvider = on6Var;
        this.authorizationManagerProvider = on6Var2;
        this.requestProxyProvider = on6Var3;
        this.serverMonitorProvider = on6Var4;
        this.accountManagerProvider = on6Var5;
        this.contextProvider = on6Var6;
        this.sharedPreferencesProxyProvider = on6Var7;
        this.miuiUtilsProvider = on6Var8;
        this.googleUtilsProvider = on6Var9;
    }

    public static et4 create(on6 on6Var, on6 on6Var2, on6 on6Var3, on6 on6Var4, on6 on6Var5, on6 on6Var6, on6 on6Var7, on6 on6Var8, on6 on6Var9) {
        return new MovieDownloadUrlService_MembersInjector(on6Var, on6Var2, on6Var3, on6Var4, on6Var5, on6Var6, on6Var7, on6Var8, on6Var9);
    }

    public void injectMembers(MovieDownloadUrlService movieDownloadUrlService) {
        movieDownloadUrlService.languageHelper = (d04) this.languageHelperProvider.get();
        movieDownloadUrlService.authorizationManager = (i10) this.authorizationManagerProvider.get();
        movieDownloadUrlService.requestProxy = (x57) this.requestProxyProvider.get();
        movieDownloadUrlService.serverMonitor = (bp7) this.serverMonitorProvider.get();
        movieDownloadUrlService.accountManager = (c5) this.accountManagerProvider.get();
        movieDownloadUrlService.context = (Context) this.contextProvider.get();
        movieDownloadUrlService.sharedPreferencesProxy = (lu7) this.sharedPreferencesProxyProvider.get();
        movieDownloadUrlService.miuiUtils = (fw4) this.miuiUtilsProvider.get();
        movieDownloadUrlService.googleUtils = (qu2) this.googleUtilsProvider.get();
    }
}
