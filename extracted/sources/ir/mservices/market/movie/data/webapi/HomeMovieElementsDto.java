package ir.mservices.market.movie.data.webapi;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.common.data.DynamicButtonDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeMovieElementsDto implements bf5, Serializable {

    @vo7("dynamicButton")
    private final DynamicButtonDto dynamicButton;

    @vo7("elements")
    private final List<HomeMovieDto> elements;

    @vo7("eol")
    private final boolean eol;

    public HomeMovieElementsDto(List<HomeMovieDto> list, boolean z, DynamicButtonDto dynamicButtonDto) {
        js3.p(list, "elements");
        this.elements = list;
        this.eol = z;
        this.dynamicButton = dynamicButtonDto;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public final DynamicButtonDto getDynamicButton() {
        return this.dynamicButton;
    }

    public final List<HomeMovieDto> getElements() {
        return this.elements;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public /* synthetic */ HomeMovieElementsDto(List list, boolean z, DynamicButtonDto dynamicButtonDto, int i, yd1 yd1Var) {
        this(list, z, (i & 4) != 0 ? null : dynamicButtonDto);
    }
}
