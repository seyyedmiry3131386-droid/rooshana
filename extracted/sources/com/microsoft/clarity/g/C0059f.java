package com.microsoft.clarity.g;

import com.microsoft.clarity.i.C0083e;
import com.microsoft.clarity.models.ingest.analytics.ClickEvent;
import com.microsoft.clarity.models.viewhierarchy.ViewNode;
import defpackage.js3;
import defpackage.s87;
import defpackage.t87;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;

/* JADX INFO: renamed from: com.microsoft.clarity.g.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0059f {
    public final C0083e a;

    public C0059f(C0083e c0083e) {
        js3.p(c0083e, "errorCallback");
        this.a = c0083e;
    }

    public static C0055b a(ViewNode viewNode, ClickEvent clickEvent, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        List<ViewNode> children = viewNode.getChildren();
        js3.p(children, "<this>");
        Iterator it = new t87(children).iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) ((s87) it).b;
            if (!listIterator.hasPrevious()) {
                break;
            }
            ViewNode viewNode2 = (ViewNode) listIterator.previous();
            Pair pair = new Pair(viewNode2.getType(), Integer.valueOf(viewNode2.getId()));
            Object obj = linkedHashMap.get(pair);
            if (obj == null) {
                obj = 0;
                linkedHashMap.put(pair, obj);
            }
            int iIntValue = ((Number) obj).intValue();
            if (!viewNode2.isRoot() && clickEvent.getAbsX() >= viewNode2.getX()) {
                if (clickEvent.getAbsX() <= viewNode2.getWidth() + viewNode2.getX() && clickEvent.getAbsY() >= viewNode2.getY()) {
                    if (clickEvent.getAbsY() <= viewNode2.getHeight() + viewNode2.getY()) {
                        C0055b c0055bA = a(viewNode2, clickEvent, iIntValue);
                        c0055bA.a(viewNode.getType(), viewNode.getId(), i);
                        arrayList.add(c0055bA);
                    }
                }
            }
            Object obj2 = linkedHashMap.get(pair);
            js3.m(obj2);
            linkedHashMap.put(pair, Integer.valueOf(((Number) obj2).intValue() + 1));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((C0055b) obj3).b) {
                arrayList2.add(obj3);
            }
        }
        C0055b c0055b = (C0055b) kotlin.collections.a.x0(arrayList2, new C0056c());
        if (c0055b != null) {
            return c0055b;
        }
        if (viewNode.getClickable() || arrayList.isEmpty()) {
            return new C0055b(viewNode, i, viewNode.getClickable());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (!((C0055b) obj4).b) {
                arrayList3.add(obj4);
            }
        }
        Object objX0 = kotlin.collections.a.x0(arrayList3, new C0057d());
        js3.m(objX0);
        return (C0055b) objX0;
    }

    public static String a(ViewNode viewNode) {
        String text = viewNode.getText();
        Iterator<T> it = viewNode.getChildren().iterator();
        while (it.hasNext()) {
            String strA = a((ViewNode) it.next());
            if (new C0058e().compare(text, strA) < 0) {
                text = strA;
            }
        }
        return text;
    }
}
