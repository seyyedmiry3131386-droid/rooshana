package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.animation.core.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.coroutines.c;
import ir.mservices.market.data.permission.PermissionReasonId;
import ir.mservices.market.data.permission.Quality;
import ir.mservices.market.pika.connect.dialog.PikaSelectDeviceBottomDialog;
import ir.mservices.market.reels.download.a;
import ir.mservices.market.search.history.ui.SearchHistoryRecyclerListFragment;
import ir.mservices.market.search.result.SearchResultFragment;
import ir.mservices.market.social.list.items.SelectedItemsFragment;
import ir.mservices.market.version2.fragments.dialog.ReportDialogFragment;
import ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment;
import ir.mservices.market.version2.manager.install.f;
import ir.mservices.market.version2.manager.player.doubleTap.customPlayer.PlayerOverlay;
import ir.mservices.market.version2.manager.player.doubleTap.customPlayer.views.SecondsView;
import ir.mservices.market.views.ExtendedSwipeRefreshLayout;
import ir.myket.player.provider.PlayerActivity;
import ir.myket.player.provider.service.PlaybackService;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.collections.b;
import org.koin.android.scope.ScopeService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o06 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o06(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bp2
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException, IOException {
        int iP0;
        Pair pair;
        Pair pair2;
        ov ovVar;
        int i = this.a;
        char c = 1;
        tx8 tx8Var = tx8.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                PagingRecyclerListContentFragment pagingRecyclerListContentFragment = (PagingRecyclerListContentFragment) obj;
                int i3 = PagingRecyclerListContentFragment.e1;
                ExtendedSwipeRefreshLayout extendedSwipeRefreshLayoutB1 = pagingRecyclerListContentFragment.B1();
                if (extendedSwipeRefreshLayoutB1 != null) {
                    extendedSwipeRefreshLayoutB1.setRefreshing(false);
                }
                pagingRecyclerListContentFragment.D1();
                return tx8Var;
            case 1:
                c cVar = (c) obj;
                return cVar.a.d(cVar.b);
            case 2:
                PikaSelectDeviceBottomDialog pikaSelectDeviceBottomDialog = (PikaSelectDeviceBottomDialog) obj;
                g86 g86Var = pikaSelectDeviceBottomDialog.i1;
                js3.m(g86Var);
                RecyclerView recyclerView = g86Var.w;
                js3.o(recyclerView, "recyclerView");
                if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
                    recyclerView.addOnLayoutChangeListener(new at1(3, pikaSelectDeviceBottomDialog));
                } else {
                    pikaSelectDeviceBottomDialog.T0();
                }
                return tx8Var;
            case 3:
                int i4 = PlaybackService.k;
                return new va6((PlaybackService) obj);
            case 4:
                int i5 = PlayerActivity.K;
                return gu9.t(((PlayerActivity) obj).getIntent().getExtras());
            case 5:
                PlayerOverlay playerOverlay = (PlayerOverlay) obj;
                wv8 wv8Var = playerOverlay.w;
                SecondsView secondsView = playerOverlay.r;
                if (wv8Var != null) {
                    ((PlayerOverlay) wv8Var.d).setVisibility(8);
                }
                secondsView.setVisibility(4);
                secondsView.setSeconds(0);
                secondsView.t();
                return tx8Var;
            case 6:
                return Float.valueOf(((zl6) obj).b);
            case 7:
                qh6 qh6Var = (qh6) obj;
                po7 po7VarC = z27.c("kotlinx.serialization.Polymorphic", oh6.b, new no7[0], new z45(20, qh6Var));
                ps0 ps0Var = qh6Var.a;
                js3.p(ps0Var, "context");
                return new z41(po7VarC, ps0Var);
            case 8:
                return ((f) obj).a.getPackageManager().getPackageInstaller();
            case 9:
                File file = (File) ((xv3) obj).invoke();
                String name = file.getName();
                js3.o(name, "getName(...)");
                if (!f88.E0('.', name, "").equals("preferences_pb")) {
                    throw new IllegalStateException(bl4.u("File extension for file: ", file, " does not match required extension for Preferences file: preferences_pb").toString());
                }
                File absoluteFile = file.getAbsoluteFile();
                js3.o(absoluteFile, "getAbsoluteFile(...)");
                return absoluteFile;
            case 10:
                a aVar = (a) obj;
                b56 b56Var = aVar.e;
                Resources resources = aVar.b.getResources();
                b56Var.getClass();
                return b56.a(resources, 2, PermissionReasonId.i, Quality.OPTIONAL);
            case 11:
                return ((ReportDialogFragment) obj).W0().g;
            case 12:
                o67 o67Var = (o67) obj;
                ClassLoader classLoader = o67Var.c;
                tb2 tb2Var = o67Var.d;
                Enumeration<URL> resources2 = classLoader.getResources("");
                js3.o(resources2, "getResources(...)");
                ArrayList<URL> list = Collections.list(resources2);
                js3.o(list, "list(...)");
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    js3.m(url);
                    if (js3.i(url.getProtocol(), "file")) {
                        String str = s26.b;
                        pair2 = new Pair(tb2Var, rl3.z(new File(url.toURI())));
                    } else {
                        pair2 = null;
                    }
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
                Enumeration<URL> resources3 = classLoader.getResources("META-INF/MANIFEST.MF");
                js3.o(resources3, "getResources(...)");
                ArrayList<URL> list2 = Collections.list(resources3);
                js3.o(list2, "list(...)");
                ArrayList arrayList2 = new ArrayList();
                for (URL url2 : list2) {
                    js3.m(url2);
                    String string = url2.toString();
                    js3.o(string, "toString(...)");
                    if (m88.Z(string, "jar:file:", false) && (iP0 = f88.p0(6, string, "!")) != -1) {
                        String str2 = s26.b;
                        String strSubstring = string.substring(4, iP0);
                        js3.o(strSubstring, "substring(...)");
                        pair = new Pair(uy6.h(rl3.z(new File(URI.create(strSubstring))), tb2Var, new v27(c == true ? 1 : 0)), o67.f);
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                return kotlin.collections.a.z0(arrayList2, arrayList);
            case 13:
                ClassLoader classLoader2 = (ClassLoader) ((xg5) obj).b;
                Class<?> clsLoadClass = classLoader2.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                js3.o(clsLoadClass, "loadClass(...)");
                Method declaredMethod = clsLoadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> clsLoadClass2 = classLoader2.loadClass("androidx.window.extensions.WindowExtensions");
                js3.o(clsLoadClass2, "loadClass(...)");
                js3.m(declaredMethod);
                return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            case 14:
                ad7 ad7Var = (ad7) obj;
                td7 td7Var = ad7Var.a;
                Object obj2 = ad7Var.d;
                if (obj2 != null) {
                    return td7Var.h(ad7Var, obj2);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 15:
                rn6 rn6Var = ((id7) obj).c;
                if (rn6Var == null) {
                    return null;
                }
                b.I();
                Bundle bundleG = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                rn6Var.w(bundleG);
                if (bundleG.isEmpty()) {
                    return null;
                }
                return bundleG;
            case 16:
                return rq4.C((x79) obj);
            case 17:
                qd7 qd7Var = (qd7) obj;
                qd7Var.D().a(new ry6(i2, qd7Var));
                return tx8Var;
            case 18:
                lf7 lf7Var = (lf7) obj;
                mz3 mz3Var = lf7Var.e;
                mz3Var.a.t("|- (-) Scope - id:'" + lf7Var.b + '\'');
                LinkedHashSet linkedHashSet = lf7Var.h;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((ey0) it.next()).getClass();
                }
                linkedHashSet.clear();
                lf7Var.j = true;
                lf7Var.g = null;
                ThreadLocal threadLocal = lf7Var.i;
                if (threadLocal != null && (ovVar = (ov) threadLocal.get()) != null) {
                    ovVar.clear();
                }
                lf7Var.i = null;
                mz3Var.c.x(lf7Var);
                return tx8Var;
            case 19:
                wg7 wg7Var = (wg7) obj;
                eg egVar = (eg) y97.t(wg7Var, nx5.a);
                wg7Var.z = egVar;
                wg7Var.A = egVar != null ? new androidx.compose.foundation.c(egVar.a, egVar.b, egVar.c, egVar.d) : null;
                return tx8Var;
            case 20:
                return z27.c("ir.myket.navigation.navigator.AppNavKey.TabNavKey", oh6.c, new no7[0], new hh7((ih7) obj, i2));
            case 21:
                int i6 = SearchHistoryRecyclerListFragment.e1;
                return ((SearchHistoryRecyclerListFragment) obj).r0().r0();
            case 22:
                return Integer.valueOf(((oi7) obj).a.deleteBuilder().delete());
            case 23:
                int i7 = SearchResultFragment.R0;
                return ((SearchResultFragment) obj).r0().r0();
            case 24:
                e eVar = (e) obj;
                jr8 jr8Var = eVar.f;
                eVar.g = jr8Var != null ? ((Number) jr8Var.l.getValue()).longValue() : 0L;
                return tx8Var;
            case 25:
                int i8 = SelectedItemsFragment.Z0;
                return ((SelectedItemsFragment) obj).r0();
            case 26:
                return obj;
            case 27:
                po7 po7Var = (po7) obj;
                return Integer.valueOf(xq2.w(po7Var, po7Var.k));
            case 28:
                ScopeService scopeService = (ScopeService) obj;
                mz3 mz3VarX = dy3.x(scopeService);
                String strQ = dt2.q(scopeService);
                mz3VarX.getClass();
                js3.p(strQ, "scopeId");
                vp7 vp7Var = mz3VarX.c;
                vp7Var.getClass();
                lf7 lf7Var2 = (lf7) ((ConcurrentHashMap) vp7Var.d).get(strQ);
                return lf7Var2 == null ? mz3.c(mz3VarX, dt2.q(scopeService), dt2.r(scopeService), scopeService, null, 8) : lf7Var2;
            default:
                tr7 tr7Var = (tr7) obj;
                wb5 wb5Var = tr7Var.c;
                if (((ey7) ((s08) wb5Var).getValue()).a == 9205357640488583168L || ey7.f(((ey7) ((s08) wb5Var).getValue()).a)) {
                    return null;
                }
                return tr7Var.a.b(((ey7) ((s08) wb5Var).getValue()).a);
        }
    }
}
