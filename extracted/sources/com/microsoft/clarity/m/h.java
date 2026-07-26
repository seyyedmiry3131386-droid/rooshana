package com.microsoft.clarity.m;

import com.microsoft.clarity.models.display.commands.ClipCommand;
import com.microsoft.clarity.models.display.commands.ClipPath;
import com.microsoft.clarity.models.display.commands.ClipRRect;
import com.microsoft.clarity.models.display.commands.ClipRect;
import com.microsoft.clarity.models.display.commands.Concat;
import com.microsoft.clarity.models.display.commands.Concat44;
import com.microsoft.clarity.models.display.commands.DisplayCommand;
import com.microsoft.clarity.models.display.commands.DrawArc;
import com.microsoft.clarity.models.display.commands.DrawBehindPaint;
import com.microsoft.clarity.models.display.commands.DrawDRRect;
import com.microsoft.clarity.models.display.commands.DrawImage;
import com.microsoft.clarity.models.display.commands.DrawImageLattice;
import com.microsoft.clarity.models.display.commands.DrawImageNine;
import com.microsoft.clarity.models.display.commands.DrawImageRect;
import com.microsoft.clarity.models.display.commands.DrawOval;
import com.microsoft.clarity.models.display.commands.DrawPaint;
import com.microsoft.clarity.models.display.commands.DrawPath;
import com.microsoft.clarity.models.display.commands.DrawPoints;
import com.microsoft.clarity.models.display.commands.DrawRRect;
import com.microsoft.clarity.models.display.commands.DrawRect;
import com.microsoft.clarity.models.display.commands.DrawTextBlob;
import com.microsoft.clarity.models.display.commands.DrawVertices;
import com.microsoft.clarity.models.display.commands.DrawViewContentEndAnnotation;
import com.microsoft.clarity.models.display.commands.DrawViewContentStartAnnotation;
import com.microsoft.clarity.models.display.commands.DrawViewEndAnnotation;
import com.microsoft.clarity.models.display.commands.DrawViewStartAnnotation;
import com.microsoft.clarity.models.display.commands.FillViewContentCommandsAnnotation;
import com.microsoft.clarity.models.display.commands.Restore;
import com.microsoft.clarity.models.display.commands.Save;
import com.microsoft.clarity.models.display.commands.SaveBehind;
import com.microsoft.clarity.models.display.commands.SaveLayer;
import com.microsoft.clarity.models.display.commands.Scale;
import com.microsoft.clarity.models.display.commands.SetMatrix;
import com.microsoft.clarity.models.display.commands.SetMatrix44;
import com.microsoft.clarity.models.display.commands.Translate;
import com.microsoft.clarity.models.display.common.IRect;
import com.microsoft.clarity.models.display.common.Point;
import com.microsoft.clarity.models.display.common.RRect;
import com.microsoft.clarity.models.display.common.Rect;
import com.microsoft.clarity.models.display.images.Lattice;
import com.microsoft.clarity.models.display.images.Sampling;
import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.br9;
import defpackage.gj4;
import defpackage.ij4;
import defpackage.js3;
import defpackage.m88;
import defpackage.ow8;
import defpackage.wu0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements b {
    public static final ArrayList a = br9.o("UNUSED", "CLIP_PATH", "CLIP_REGION", "CLIP_RECT", "CLIP_RRECT", "CONCAT", "DRAW_BITMAP_RETIRED_2016_REMOVED_2018", "DRAW_BITMAP_MATRIX_RETIRED_2016_REMOVED_2018", "DRAW_BITMAP_NINE_RETIRED_2016_REMOVED_2018", "DRAW_BITMAP_RECT_RETIRED_2016_REMOVED_2018", "DRAW_CLEAR", "DRAW_DATA", "DRAW_OVAL", "DRAW_PAINT", "DRAW_PATH", "DRAW_PICTURE", "DRAW_POINTS", "DRAW_POS_TEXT_REMOVED_1_2019", "DRAW_POS_TEXT_TOP_BOTTOM_REMOVED_1_2019", "DRAW_POS_TEXT_H_REMOVED_1_2019", "DRAW_POS_TEXT_H_TOP_BOTTOM_REMOVED_1_2019", "DRAW_RECT", "DRAW_RRECT", "DRAW_SPRITE_RETIRED_2015_REMOVED_2018", "DRAW_TEXT_REMOVED_1_2019", "DRAW_TEXT_ON_PATH_RETIRED_08_2018_REMOVED_10_2018", "DRAW_TEXT_TOP_BOTTOM_REMOVED_1_2019", "DRAW_VERTICES_RETIRED_03_2017_REMOVED_01_2018", "RESTORE", "ROTATE", "SAVE", "SAVE_LAYER_SAVEFLAGS_DEPRECATED_2015_REMOVED_12_2020", "SCALE", "SET_MATRIX", "SKEW", "TRANSLATE", "NOOP", "BEGIN_COMMENT_GROUP_obsolete", "COMMENT_obsolete", "END_COMMENT_GROUP_obsolete", "DRAW_DRRECT", "PUSH_CULL", "POP_CULL", "DRAW_PATCH", "DRAW_PICTURE_MATRIX_PAINT", "DRAW_TEXT_BLOB", "DRAW_IMAGE", "DRAW_IMAGE_RECT_STRICT_obsolete", "DRAW_ATLAS", "DRAW_IMAGE_NINE", "DRAW_IMAGE_RECT", "SAVE_LAYER_SAVELAYERFLAGS_DEPRECATED_JAN_2016_REMOVED_01_2018", "SAVE_LAYER_SAVELAYERREC", "DRAW_ANNOTATION", "DRAW_DRAWABLE", "DRAW_DRAWABLE_MATRIX", "DRAW_TEXT_RSXFORM_DEPRECATED_DEC_2018", "TRANSLATE_Z", "DRAW_SHADOW_REC", "DRAW_IMAGE_LATTICE", "DRAW_ARC", "DRAW_REGION", "DRAW_VERTICES_OBJECT", "FLUSH", "DRAW_EDGEAA_IMAGE_SET", "SAVE_BEHIND", "DRAW_EDGEAA_QUAD", "DRAW_BEHIND_PAINT", "CONCAT44", "CLIP_SHADER_IN_PAINT", "MARK_CTM", "SET_M44", "DRAW_IMAGE2", "DRAW_IMAGE_RECT2", "DRAW_IMAGE_LATTICE2", "DRAW_EDGEAA_IMAGE_SET2");
    public static final Regex b = new Regex("id=([0-9]+),");

    public static Lattice d(d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iD = dVar.d();
        for (int i = 0; i < iD; i++) {
            arrayList.add(Integer.valueOf(dVar.d()));
        }
        int iD2 = dVar.d();
        for (int i2 = 0; i2 < iD2; i2++) {
            arrayList2.add(Integer.valueOf(dVar.d()));
        }
        int iD3 = dVar.d();
        int i3 = ((iD3 + 3) >>> 2) << 2;
        for (int i4 = 0; i4 < iD3; i4++) {
            arrayList3.add(Integer.valueOf(dVar.a()));
        }
        dVar.a(i3 - iD3, false);
        for (int i5 = 0; i5 < iD3; i5++) {
            arrayList4.add(new ow8(dVar.l()));
        }
        IRect iRect = new IRect(dVar.d(), dVar.d(), dVar.d(), dVar.d());
        ArrayList arrayList5 = new ArrayList(wu0.V(arrayList4, 10));
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            arrayList5.add(Long.valueOf(((long) ((ow8) it.next()).a) & 4294967295L));
        }
        return new Lattice(arrayList, arrayList2, arrayList3, iRect, arrayList5);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [yd1] */
    /* JADX WARN: Type inference failed for: r9v13 */
    @Override // com.microsoft.clarity.m.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final DisplayCommand a(d dVar) throws IOException {
        js3.p(dVar, "buffer");
        int iL = dVar.l();
        int i = iL >>> 24;
        int iL2 = iL & 16777215;
        if (iL2 == 16777215) {
            iL2 = dVar.l();
        }
        ArrayList arrayList = a;
        String str = (String) arrayList.get(i);
        int i2 = 2;
        boolean z = false;
        boolean z2 = false;
        DisplayCommand drawViewStartAnnotation = null;
        switch (str.hashCode()) {
            case -1786840618:
                if (str.equals("UNUSED")) {
                    throw new IllegalArgumentException("UNUSED Op Code");
                }
                break;
            case -1591970486:
                if (str.equals("DRAW_VERTICES_OBJECT")) {
                    return c(dVar);
                }
                break;
            case -1590712816:
                if (str.equals("SET_M44")) {
                    return new SetMatrix44(dVar.f());
                }
                break;
            case -1332186515:
                if (str.equals("DRAW_OVAL")) {
                    return new DrawOval(dVar.i(), Integer.valueOf(dVar.d() - 1));
                }
                break;
            case -1332176320:
                if (str.equals("DRAW_PATH")) {
                    return new DrawPath(dVar.d() - 1, Integer.valueOf(dVar.d() - 1));
                }
                break;
            case -1332113409:
                if (str.equals("DRAW_RECT")) {
                    return new DrawRect(dVar.i(), Integer.valueOf(dVar.d() - 1));
                }
                break;
            case -1121890196:
                if (str.equals("SAVE_LAYER_SAVELAYERREC")) {
                    int iD = dVar.d();
                    return new SaveLayer((iD & 1) != 0 ? dVar.i() : null, (iD & 8) != 0 ? Integer.valueOf(dVar.d() - 1) : 0, (iD & 4) != 0 ? Integer.valueOf(dVar.d() - 1) : null, (iD & 2) != 0 ? Integer.valueOf(dVar.d() - 1) : null);
                }
                break;
            case -1049093241:
                if (str.equals("CLIP_RRECT")) {
                    RRect rRectH = dVar.h();
                    int iL3 = dVar.l();
                    ClipCommand.Companion companion = ClipCommand.Companion;
                    ClipRRect clipRRect = new ClipRRect(rRectH, companion.m18extractClipOpFromFlagsWZ4Q5Ns(iL3), companion.m17extractAntiAliasFromFlagsWZ4Q5Ns(iL3));
                    if (iL2 == 60) {
                        dVar.d();
                    }
                    return clipRRect;
                }
                break;
            case -649099571:
                if (str.equals("DRAW_DRRECT")) {
                    return new DrawDRRect(dVar.h(), dVar.h(), Integer.valueOf(dVar.d() - 1));
                }
                break;
            case -511075918:
                if (str.equals("DRAW_IMAGE2")) {
                    return new DrawImage(dVar.b(), dVar.b(), Integer.valueOf(dVar.d()), e(dVar), Integer.valueOf(dVar.d() - 1));
                }
                break;
            case -455540434:
                if (str.equals("TRANSLATE")) {
                    return new Translate(dVar.b(), dVar.b());
                }
                break;
            case -308579266:
                if (str.equals("DRAW_POINTS")) {
                    int iD2 = dVar.d() - 1;
                    int iD3 = dVar.d();
                    int iD4 = dVar.d();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < iD4; i3++) {
                        arrayList2.add(new Point(dVar.b(), dVar.b()));
                    }
                    return new DrawPoints(iD3, arrayList2, Integer.valueOf(iD2));
                }
                break;
            case -42987337:
                if (str.equals("DRAW_ARC")) {
                    return new DrawArc(dVar.i(), dVar.b(), dVar.b(), dVar.d() != 0, Integer.valueOf(dVar.d() - 1));
                }
                break;
            case 2537853:
                if (str.equals("SAVE")) {
                    return new Save();
                }
                break;
            case 66138676:
                if (str.equals("DRAW_TEXT_BLOB")) {
                    return new DrawTextBlob(Integer.valueOf(dVar.d() - 1), dVar.d() - 1, dVar.b(), dVar.b());
                }
                break;
            case 78713130:
                if (str.equals("SCALE")) {
                    return new Scale(dVar.b(), dVar.b());
                }
                break;
            case 199490708:
                if (str.equals("CONCAT44")) {
                    return new Concat44(dVar.f());
                }
                break;
            case 803513915:
                if (str.equals("DRAW_IMAGE_LATTICE2")) {
                    return new DrawImageLattice(d(dVar), dVar.i(), Integer.valueOf(dVar.d()), Long.valueOf(((long) dVar.l()) & 4294967295L), Integer.valueOf(dVar.d() - 1));
                }
                break;
            case 829952572:
                if (str.equals("SAVE_BEHIND")) {
                    int iD5 = dVar.d();
                    return new SaveBehind(iD5, (iD5 & 1) != 0 ? dVar.i() : null);
                }
                break;
            case 932120596:
                if (str.equals("DRAW_BEHIND_PAINT")) {
                    return new DrawBehindPaint(Integer.valueOf(dVar.d() - 1));
                }
                break;
            case 995751127:
                if (str.equals("DRAW_IMAGE_LATTICE")) {
                    return new DrawImageLattice(d(dVar), dVar.i(), Integer.valueOf(dVar.d()), null, Integer.valueOf(dVar.d() - 1));
                }
                break;
            case 1119528015:
                if (str.equals("DRAW_IMAGE_RECT2")) {
                    return new DrawImageRect(dVar.i(), dVar.i(), Integer.valueOf(dVar.d()), dVar.d(), e(dVar), Integer.valueOf(dVar.d() - 1));
                }
                break;
            case 1213008820:
                if (str.equals("CLIP_PATH")) {
                    int iD6 = dVar.d() - 1;
                    int iL4 = dVar.l();
                    ClipCommand.Companion companion2 = ClipCommand.Companion;
                    ClipPath clipPath = new ClipPath(iD6, companion2.m18extractClipOpFromFlagsWZ4Q5Ns(iL4), companion2.m17extractAntiAliasFromFlagsWZ4Q5Ns(iL4));
                    if (iL2 == 16) {
                        dVar.d();
                    }
                    return clipPath;
                }
                break;
            case 1213071731:
                if (str.equals("CLIP_RECT")) {
                    Rect rectI = dVar.i();
                    int iL5 = dVar.l();
                    ClipCommand.Companion companion3 = ClipCommand.Companion;
                    ClipRect clipRect = new ClipRect(rectI, companion3.m18extractClipOpFromFlagsWZ4Q5Ns(iL5), companion3.m17extractAntiAliasFromFlagsWZ4Q5Ns(iL5));
                    if (iL2 == 28) {
                        dVar.d();
                    }
                    return (((int) clipRect.getRect().getRight()) == 999991 && ((int) clipRect.getRect().getBottom()) == 999991) ? new DrawViewStartAnnotation((int) clipRect.getRect().getLeft(), z2 ? 1 : 0, i2, num) : (((int) clipRect.getRect().getRight()) == 999992 && ((int) clipRect.getRect().getBottom()) == 999992) ? new DrawViewEndAnnotation((int) clipRect.getRect().getLeft(), z ? 1 : 0, i2, num) : (((int) clipRect.getRect().getRight()) == 999988 && ((int) clipRect.getRect().getBottom()) == 999988) ? new FillViewContentCommandsAnnotation((int) clipRect.getRect().getLeft()) : (((int) clipRect.getRect().getRight()) == 999989 && ((int) clipRect.getRect().getBottom()) == 999989) ? new DrawViewContentStartAnnotation((int) clipRect.getRect().getLeft()) : (((int) clipRect.getRect().getRight()) == 999990 && ((int) clipRect.getRect().getBottom()) == 999990) ? new DrawViewContentEndAnnotation((int) clipRect.getRect().getLeft()) : clipRect;
                }
                break;
            case 1646081664:
                if (str.equals("DRAW_IMAGE")) {
                    return new DrawImage(dVar.b(), dVar.b(), Integer.valueOf(dVar.d()), null, Integer.valueOf(dVar.d() - 1));
                }
                break;
            case 1652196739:
                if (str.equals("DRAW_PAINT")) {
                    return new DrawPaint(Integer.valueOf(dVar.d() - 1));
                }
                break;
            case 1654546043:
                if (str.equals("DRAW_RRECT")) {
                    return new DrawRRect(dVar.h(), Integer.valueOf(dVar.d() - 1));
                }
                break;
            case 1695470858:
                if (str.equals("DRAW_ANNOTATION")) {
                    dVar.b();
                    dVar.b();
                    dVar.b();
                    dVar.b();
                    int iL6 = dVar.l();
                    int i4 = ((iL6 + 4) >>> 2) << 2;
                    String strA = dVar.a(iL6);
                    if (m88.Z(strA, "RenderNode", false) || m88.Z(strA, "/RenderNode", false)) {
                        ij4 ij4VarA = b.a(strA);
                        int i5 = ij4VarA != null ? Integer.parseInt((String) ((gj4) ij4VarA.a()).get(1)) : 0;
                        drawViewStartAnnotation = m88.Z(strA, "R", false) ? new DrawViewStartAnnotation(i5, false) : new DrawViewEndAnnotation(i5, false);
                    }
                    dVar.a(i4 - iL6, false);
                    dVar.a(((dVar.l() + 3) >>> 2) << 2, false);
                    return drawViewStartAnnotation;
                }
                break;
            case 1756682846:
                if (str.equals("SET_MATRIX")) {
                    return new SetMatrix(dVar.e());
                }
                break;
            case 1815502446:
                if (str.equals("RESTORE")) {
                    return new Restore();
                }
                break;
            case 1837114129:
                if (str.equals("DRAW_IMAGE_NINE")) {
                    return new DrawImageNine(new IRect(dVar.d(), dVar.d(), dVar.d(), dVar.d()), dVar.i(), Integer.valueOf(dVar.d()), Integer.valueOf(dVar.d() - 1));
                }
                break;
            case 1837229123:
                if (str.equals("DRAW_IMAGE_RECT")) {
                    return new DrawImageRect(dVar.d() != 0 ? dVar.i() : null, dVar.i(), Integer.valueOf(dVar.d()), dVar.d(), null, Integer.valueOf(dVar.d() - 1));
                }
                break;
            case 1993501460:
                if (str.equals("CONCAT")) {
                    return new Concat(dVar.e());
                }
                break;
        }
        dVar.a(iL2 - 4, false);
        com.microsoft.clarity.l.a aVarA = a();
        if (aVarA != null) {
            aVarA.a(new com.microsoft.clarity.c.d("Unknown op code: " + ((Object) String.valueOf(4294967295L & ((long) i))) + ' ' + ((String) arrayList.get(i)), "OpCode", getClass().getName()), ErrorType.Parsing);
        }
        return null;
    }

    public abstract DrawVertices c(d dVar);

    public Sampling e(d dVar) {
        js3.p(dVar, "buffer");
        return dVar.j();
    }
}
