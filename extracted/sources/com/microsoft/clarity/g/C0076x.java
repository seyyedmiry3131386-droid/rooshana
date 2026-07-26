package com.microsoft.clarity.g;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.microsoft.clarity.ClarityConfig;
import com.microsoft.clarity.i.C0088j;
import com.microsoft.clarity.models.DynamicConfig;
import com.microsoft.clarity.models.viewhierarchy.ViewNode;
import defpackage.js3;
import defpackage.m88;
import defpackage.yu0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.microsoft.clarity.g.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0076x {
    public final Context a;
    public final ClarityConfig b;
    public final E c;
    public final DynamicConfig d;
    public final C0088j e;
    public final DisplayMetrics f;
    public final LinkedHashSet g;
    public final LinkedHashSet h;
    public final C0060g i;
    public final Integer j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public int m;
    public LinkedHashMap n;
    public final Class o;
    public final int p;

    public C0076x(Context context, ClarityConfig clarityConfig, E e, DynamicConfig dynamicConfig, C0088j c0088j) {
        Integer numValueOf;
        int color;
        js3.p(context, "context");
        js3.p(clarityConfig, "config");
        js3.p(e, "hardwareBitmapCache");
        js3.p(dynamicConfig, "dynamicConfig");
        js3.p(c0088j, "errorCallback");
        this.a = context;
        this.b = clarityConfig;
        this.c = e;
        this.d = dynamicConfig;
        this.e = c0088j;
        this.f = context.getResources().getDisplayMetrics();
        this.g = new LinkedHashSet();
        this.h = new LinkedHashSet();
        this.i = new C0060g(c0088j);
        Class clsA = null;
        try {
            numValueOf = Integer.valueOf(context.getResources().getIdentifier("fragment_container_view_tag", "id", context.getPackageName()));
        } catch (Exception unused) {
            numValueOf = null;
        }
        this.j = numValueOf;
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.n = new LinkedHashMap();
        try {
            HashMap map = com.microsoft.clarity.q.p.a;
            clsA = com.microsoft.clarity.q.o.a("com.facebook.react.views.view.ReactViewGroup");
        } catch (Exception unused2) {
        }
        this.o = clsA;
        boolean z = (this.a.getResources().getConfiguration().uiMode & 48) == 32;
        try {
            color = this.a.getResources().getColor(Build.VERSION.SDK_INT >= 34 ? z ? R.color.system_background_dark : R.color.system_background_light : z ? R.color.background_dark : R.color.background_light, this.a.getTheme());
        } catch (Exception unused3) {
            color = z ? -16777216 : -1;
        }
        this.p = color;
    }

    public static final boolean a(C0076x c0076x, View view) {
        c0076x.getClass();
        return view != null && view.equals(view.getRootView()) && view.isLaidOut() && view.isShown() && view.isAttachedToWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v76, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.microsoft.clarity.models.observers.FramePicture a(android.app.Activity r25, com.microsoft.clarity.models.observers.ScreenMetadata r26, boolean r27, boolean r28, defpackage.dp2 r29, boolean r30) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 1569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.clarity.g.C0076x.a(android.app.Activity, com.microsoft.clarity.models.observers.ScreenMetadata, boolean, boolean, dp2, boolean):com.microsoft.clarity.models.observers.FramePicture");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03ed A[EDGE_INSN: B:335:0x03ed->B:222:0x03ed BREAK  A[LOOP:9: B:179:0x0334->B:336:?], EDGE_INSN: B:329:0x03ed->B:222:0x03ed BREAK  A[LOOP:8: B:190:0x0361->B:333:?], EDGE_INSN: B:330:0x03ed->B:222:0x03ed BREAK  A[LOOP:8: B:190:0x0361->B:333:?], EDGE_INSN: B:331:0x03ed->B:222:0x03ed BREAK  A[LOOP:8: B:190:0x0361->B:333:?], EDGE_INSN: B:326:0x03ed->B:222:0x03ed BREAK  A[LOOP:7: B:205:0x03a7->B:328:?]] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0578  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.microsoft.clarity.models.viewhierarchy.ViewNode a(android.view.View r37, android.view.ViewGroup r38, boolean r39, boolean r40, com.microsoft.clarity.g.C0062i r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.clarity.g.C0076x.a(android.view.View, android.view.ViewGroup, boolean, boolean, com.microsoft.clarity.g.i):com.microsoft.clarity.models.viewhierarchy.ViewNode");
    }

    public static final void a(WeakReference weakReference, C0076x c0076x, ViewNode viewNode) {
        C0064k c0064k;
        js3.p(weakReference, "$viewWeakRef");
        js3.p(c0076x, "this$0");
        js3.p(viewNode, "$node");
        View view = (View) weakReference.get();
        if (view == null || !view.isDirty() || (c0064k = (C0064k) c0076x.k.get(Long.valueOf(viewNode.getRenderNodeId()))) == null) {
            return;
        }
        c0064k.b = true;
    }

    public static ArrayList a(ViewGroup viewGroup) {
        try {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(viewGroup.getChildDrawingOrder(i));
                int i2 = i;
                while (i2 > 0 && ((View) arrayList.get(i2 - 1)).getZ() > childAt.getZ()) {
                    i2--;
                }
                js3.o(childAt, "childToDraw");
                arrayList.add(i2, childAt);
            }
            return arrayList;
        } catch (Exception unused) {
            int childCount2 = viewGroup.getChildCount();
            ArrayList arrayList2 = new ArrayList(childCount2);
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = viewGroup.getChildAt(i3);
                js3.o(childAt2, "viewGroup.getChildAt(i)");
                arrayList2.add(childAt2);
            }
            if (arrayList2.size() > 1) {
                yu0.Y(arrayList2, new C0073u());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(View view, ViewGroup viewGroup, ViewNode viewNode, boolean z, Rect rect, Rect rect2, C0062i c0062i) throws Throwable {
        int i;
        ?? r14;
        C0064k c0064k;
        int i2;
        C0062i c0062i2 = c0062i;
        js3.p(view, "view");
        js3.p(viewNode, "node");
        js3.p(c0062i2, "captureContext");
        C0054a c0054a = c0062i2.a;
        float transitionAlpha = view.getTransitionAlpha() * view.getAlpha();
        int saveCount = c0054a.getSaveCount();
        float scrollX = view.getScrollX();
        float scrollY = view.getScrollY();
        try {
            if (viewNode.getVisible()) {
                int renderNodeId = (int) viewNode.getRenderNodeId();
                c0054a.save();
                c0054a.clipRect(new Rect(renderNodeId, renderNodeId, 999991, 999991));
                c0054a.restore();
                saveCount = c0054a.save();
                c0054a.translate(view.getLeft() - scrollX, view.getTop() - scrollY);
                Matrix matrix = new Matrix(view.getMatrix());
                Matrix animationMatrix = view.getAnimationMatrix();
                if (animationMatrix != null) {
                    matrix.postConcat(animationMatrix);
                }
                if (!matrix.isIdentity()) {
                    c0054a.translate(scrollX, scrollY);
                    c0054a.concat(matrix);
                    c0054a.translate(-scrollX, -scrollY);
                }
                if (transitionAlpha < 1.0f) {
                    int i3 = (int) (transitionAlpha * 255);
                    i = 0;
                    c0054a.saveLayerAlpha(scrollX, scrollY, view.getWidth() + scrollX, view.getHeight() + scrollY, i3);
                } else {
                    i = 0;
                }
                if (viewGroup != null && viewGroup.getClipChildren()) {
                    c0054a.clipRect(scrollX, scrollY, view.getWidth() + scrollX, view.getHeight() + scrollY);
                }
                if (view.getClipBounds() != null) {
                    c0054a.clipRect(view.getClipBounds());
                }
                if ((view instanceof ViewGroup) && !(view instanceof WebView)) {
                    Drawable background = view.getBackground();
                    if (background != null) {
                        if ((view.getScrollX() | view.getScrollY()) == 0) {
                            background.draw(c0054a);
                        } else {
                            float scrollX2 = view.getScrollX();
                            float scrollY2 = view.getScrollY();
                            c0054a.translate(scrollX2, scrollY2);
                            background.draw(c0054a);
                            c0054a.translate(-scrollX2, -scrollY2);
                        }
                    }
                    HashMap map = com.microsoft.clarity.q.p.a;
                    Class[] clsArr = new Class[1];
                    clsArr[i] = Canvas.class;
                    Method methodA = com.microsoft.clarity.q.o.a("android.view.View", "onDraw", clsArr);
                    if (methodA != null) {
                        Object[] objArr = new Object[1];
                        objArr[i] = c0054a;
                        methodA.invoke(view, objArr);
                    }
                }
            } else {
                i = 0;
            }
            int i4 = saveCount;
            try {
                if (!(view instanceof ViewGroup) || (view instanceof WebView)) {
                    r14 = i;
                } else {
                    int i5 = (!((ViewGroup) view).getClipToPadding() || (((((ViewGroup) view).getPaddingLeft() | ((ViewGroup) view).getPaddingTop()) | ((ViewGroup) view).getPaddingRight()) | ((ViewGroup) view).getPaddingBottom()) == 0) ? i : 1;
                    if (i5 != 0) {
                        int iSave = c0054a.save();
                        c0054a.clipRect(((ViewGroup) view).getPaddingLeft() + scrollX, ((ViewGroup) view).getPaddingTop() + scrollY, ((scrollX + ((ViewGroup) view).getRight()) - ((ViewGroup) view).getLeft()) - ((ViewGroup) view).getPaddingRight(), ((scrollY + ((ViewGroup) view).getBottom()) - ((ViewGroup) view).getTop()) - ((ViewGroup) view).getPaddingBottom());
                        i2 = iSave;
                    } else {
                        i2 = i;
                    }
                    this.i.getClass();
                    Iterator it = a((ViewGroup) view).iterator();
                    while (it.hasNext()) {
                        viewNode.addChildView(a((View) it.next(), (ViewGroup) view, viewNode.isMasked(), viewNode.getVisible(), c0062i2));
                        c0062i2 = c0062i;
                        i = i;
                    }
                    int i6 = i;
                    r14 = i6;
                    if (i5 != 0) {
                        c0054a.restoreToCount(i2);
                        r14 = i6;
                    }
                }
                if (viewNode.getVisible()) {
                    if (view instanceof WebView) {
                        if (!this.d.getDisableWebViewCapture() && !m88.Z(((WebView) view).getClass().getName(), "com.google.android.gms.ads.internal.webview", r14)) {
                            int renderNodeId2 = (int) viewNode.getRenderNodeId();
                            c0054a.save();
                            c0054a.clipRect(new Rect(renderNodeId2, renderNodeId2, 999997, 999997));
                            c0054a.clipRect(new Rect(renderNodeId2, renderNodeId2, 999998, 999998));
                            c0054a.restore();
                        } else {
                            int renderNodeId3 = (int) viewNode.getRenderNodeId();
                            int width = viewNode.getWidth();
                            int height = viewNode.getHeight();
                            c0054a.save();
                            c0054a.clipRect(new Rect(renderNodeId3, renderNodeId3, 999993, 999993));
                            c0054a.clipRect((int) r14, (int) r14, width, height);
                            c0054a.clipRect(new Rect(renderNodeId3, renderNodeId3, 999994, 999994));
                            c0054a.restore();
                        }
                    } else if (view instanceof ViewGroup) {
                        view.onDrawForeground(c0054a);
                    } else if (!(view instanceof SurfaceView)) {
                        C0064k c0064k2 = (C0064k) this.k.get(Long.valueOf(viewNode.getRenderNodeId()));
                        if (c0064k2 != null) {
                            c0064k2.f = System.currentTimeMillis();
                        }
                        if (!z) {
                            int renderNodeId4 = (int) viewNode.getRenderNodeId();
                            c0054a.save();
                            c0054a.clipRect(new Rect(renderNodeId4, renderNodeId4, 999988, 999988));
                            c0054a.restore();
                        } else {
                            int renderNodeId5 = (int) viewNode.getRenderNodeId();
                            c0054a.save();
                            c0054a.clipRect(new Rect(renderNodeId5, renderNodeId5, 999989, 999989));
                            c0054a.restore();
                            c0054a.c = Long.valueOf(viewNode.getRenderNodeId());
                            try {
                                view.draw(c0054a);
                                c0054a.c = null;
                                int renderNodeId6 = (int) viewNode.getRenderNodeId();
                                c0054a.save();
                                c0054a.clipRect(new Rect(renderNodeId6, renderNodeId6, 999990, 999990));
                                c0054a.restore();
                                C0064k c0064k3 = (C0064k) this.k.get(Long.valueOf(viewNode.getRenderNodeId()));
                                if (c0064k3 != null) {
                                    c0064k3.b = r14;
                                }
                                C0064k c0064k4 = (C0064k) this.k.get(Long.valueOf(viewNode.getRenderNodeId()));
                                if (c0064k4 != null) {
                                    c0064k4.d = rect2;
                                }
                                if (rect != null && (c0064k = (C0064k) this.k.get(Long.valueOf(viewNode.getRenderNodeId()))) != null) {
                                    c0064k.c = rect;
                                }
                            } catch (Throwable th) {
                                c0054a.c = null;
                                throw th;
                            }
                        }
                    }
                }
                if (viewNode.getVisible()) {
                    c0054a.restoreToCount(i4);
                    int renderNodeId7 = (int) viewNode.getRenderNodeId();
                    c0054a.save();
                    c0054a.clipRect(new Rect(renderNodeId7, renderNodeId7, 999992, 999992));
                    c0054a.restore();
                }
            } catch (Throwable th2) {
                th = th2;
                saveCount = i4;
                if (viewNode.getVisible()) {
                    c0054a.restoreToCount(saveCount);
                    int renderNodeId8 = (int) viewNode.getRenderNodeId();
                    c0054a.save();
                    c0054a.clipRect(new Rect(renderNodeId8, renderNodeId8, 999992, 999992));
                    c0054a.restore();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
