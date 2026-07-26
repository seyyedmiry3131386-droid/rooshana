package ir.mservices.market.movie.uri.data;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class CreditsDto implements Serializable {

    @vo7("closingCredit")
    private final MovieCreditDto closingCredit;

    @vo7("openingCredit")
    private final MovieCreditDto openingCredit;

    public CreditsDto(MovieCreditDto movieCreditDto, MovieCreditDto movieCreditDto2) {
        this.openingCredit = movieCreditDto;
        this.closingCredit = movieCreditDto2;
    }

    public final MovieCreditDto getClosingCredit() {
        return this.closingCredit;
    }

    public final MovieCreditDto getOpeningCredit() {
        return this.openingCredit;
    }
}
