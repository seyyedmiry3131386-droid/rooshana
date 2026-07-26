package com.microsoft.clarity.g;

import android.content.Context;
import com.microsoft.clarity.models.MaskingMode;
import com.microsoft.clarity.models.observers.FramePicture;
import com.microsoft.clarity.models.viewhierarchy.ViewNode;
import defpackage.br9;
import defpackage.f88;
import defpackage.js3;
import defpackage.tx8;
import defpackage.wu0;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 {
    public final Context a;
    public final MaskingMode b;
    public final LinkedHashMap c;

    public l0(Context context, MaskingMode maskingMode) {
        js3.p(context, "context");
        js3.p(maskingMode, "maskingMode");
        this.a = context;
        this.b = maskingMode;
        this.c = new LinkedHashMap();
    }

    public final void a(FramePicture framePicture) throws com.microsoft.clarity.c.a {
        js3.p(framePicture, "framePicture");
        K k = new K(framePicture.getViewHierarchy().getRoot().isMasked(), this.b, framePicture.getViewHierarchy().getMaskingDirectives());
        a(framePicture.getViewHierarchy().getRoot(), k);
        if (k.c.size() != 1) {
            throw new com.microsoft.clarity.c.a("Masking failed: imbalanced enter/exit boundaries. Expected stack size=1 (frame default), actual=" + k.c.size() + '.');
        }
        if (this.c.size() >= 5000) {
            com.microsoft.clarity.q.l.e("Clearing view entry name cache");
            this.c.clear();
        }
    }

    public final void a(ViewNode viewNode, K k) throws com.microsoft.clarity.c.a {
        if (viewNode.getId() != -1) {
            LinkedHashMap linkedHashMap = this.c;
            Integer numValueOf = Integer.valueOf(viewNode.getId());
            Object resourceEntryName = linkedHashMap.get(numValueOf);
            if (resourceEntryName == null) {
                try {
                    resourceEntryName = this.a.getResources().getResourceEntryName(viewNode.getId());
                    js3.o(resourceEntryName, "context.resources.getResourceEntryName(node.id)");
                } catch (Exception unused) {
                    resourceEntryName = "";
                }
                linkedHashMap.put(numValueOf, resourceEntryName);
            }
            viewNode.setIdEntryName((String) resourceEntryName);
        }
        int renderNodeId = (int) viewNode.getRenderNodeId();
        k.a(renderNodeId);
        viewNode.setText(a(viewNode.getText(), k));
        viewNode.setContentDescription(a(viewNode.getContentDescription(), k));
        List<ViewNode> children = viewNode.getChildren();
        ArrayList arrayList = new ArrayList(wu0.V(children, 10));
        Iterator<T> it = children.iterator();
        while (it.hasNext()) {
            a((ViewNode) it.next(), k);
            arrayList.add(tx8.a);
        }
        k.b(renderNodeId);
        if (k.c.isEmpty()) {
            throw new com.microsoft.clarity.c.a("Masking failed: empty mask stack (corrupted state).");
        }
    }

    public static String a(String str, K k) {
        if (f88.n0(str)) {
            return "";
        }
        if (((Boolean) k.c.last()).booleanValue()) {
            return Marker.ANY_MARKER;
        }
        if (k.a != MaskingMode.Balanced || k.c.c != 1) {
            return str;
        }
        List listY0 = f88.y0(str, new String[]{" "}, 6);
        ArrayList arrayList = new ArrayList(wu0.V(listY0, 10));
        Iterator it = listY0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((String) it.next()).length()));
        }
        Iterator it2 = arrayList.iterator();
        double dIntValue = 0.0d;
        int i = 0;
        while (it2.hasNext()) {
            dIntValue += (double) ((Number) it2.next()).intValue();
            i++;
            if (i < 0) {
                br9.O();
                throw null;
            }
        }
        String strT0 = kotlin.collections.a.t0(listY0, " ", null, null, new com.microsoft.clarity.q.w((int) (i == 0 ? Double.NaN : dIntValue / ((double) i))), 30);
        js3.p(strT0, ConfirmDTO.INPUT_TYPE_TEXT);
        ArrayList arrayList2 = new ArrayList(strT0.length());
        for (int i2 = 0; i2 < strT0.length(); i2++) {
            char cCharAt = strT0.charAt(i2);
            if (Character.isDigit(cCharAt)) {
                cCharAt = '*';
            }
            arrayList2.add(Character.valueOf(cCharAt));
        }
        return kotlin.collections.a.t0(arrayList2, "", null, null, null, 62);
    }
}
