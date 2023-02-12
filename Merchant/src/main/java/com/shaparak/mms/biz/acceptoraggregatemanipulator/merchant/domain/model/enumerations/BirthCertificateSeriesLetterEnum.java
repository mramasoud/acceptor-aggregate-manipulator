package com.shaparak.mms.biz.acceptoraggregatemanipulator.merchant.domain.model.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.*;

public enum BirthCertificateSeriesLetterEnum {

    Alef(0),
    Beh(1),
    Laam(2),
    Daal(3),
    Reh(4),
    Yek(5),
    Do(6),
    Seh(7),
    Chaahaar(8),
    Noh(9),
    Dah(10),
    Yaazdah(11),
    Shin(12);

    private static final Map<String, BirthCertificateSeriesLetterEnum> lettersMap =
            new HashMap<String, BirthCertificateSeriesLetterEnum>();

    static {
        // Alphabetical Series Letters
        lettersMap.put(new String(new char[]{0x0627}), BirthCertificateSeriesLetterEnum.Alef);
        lettersMap.put(new String(new char[]{0x0627, 0x0644, 0x0641}), BirthCertificateSeriesLetterEnum.Alef);
        lettersMap.put(new String(new char[]{0x0628}), BirthCertificateSeriesLetterEnum.Beh);
        lettersMap.put(new String(new char[]{0xFE8F}), BirthCertificateSeriesLetterEnum.Beh);
        lettersMap.put(new String(new char[]{0x0644}), BirthCertificateSeriesLetterEnum.Laam);
        lettersMap.put(new String(new char[]{0x0644, 0x0627, 0x0645}), BirthCertificateSeriesLetterEnum.Laam);
        lettersMap.put(new String(new char[]{0x062F}), BirthCertificateSeriesLetterEnum.Daal);
        lettersMap.put(new String(new char[]{0x062F, 0x0627, 0x0644}), BirthCertificateSeriesLetterEnum.Daal);
        lettersMap.put(new String(new char[]{0x0631}), BirthCertificateSeriesLetterEnum.Reh);
        lettersMap.put(new String(new char[]{0x0634}), BirthCertificateSeriesLetterEnum.Shin);
        lettersMap.put(new String(new char[]{0x0634, 0x06CC, 0x0646}), BirthCertificateSeriesLetterEnum.Shin);

        // Numeric Series Letters
        lettersMap.put(new String(new char[]{0x06CC, 0x06A9}), BirthCertificateSeriesLetterEnum.Yek);
        lettersMap.put(new String(new char[]{0x062F, 0x0648}), BirthCertificateSeriesLetterEnum.Do);
        lettersMap.put(new String(new char[]{0x0633, 0x0647}), BirthCertificateSeriesLetterEnum.Seh);
        lettersMap.put(new String(new char[]{0x0686, 0x0647, 0x0627, 0x0631}),
                BirthCertificateSeriesLetterEnum.Chaahaar);
        lettersMap.put(new String(new char[]{0x0646, 0x0647}), BirthCertificateSeriesLetterEnum.Noh);
        lettersMap.put(new String(new char[]{0x062F, 0x0647}), BirthCertificateSeriesLetterEnum.Dah);
        lettersMap.put(new String(new char[]{0x06CC, 0x0627, 0x0632, 0x062F, 0x0647}),
                BirthCertificateSeriesLetterEnum.Yaazdah);
    }

    private int birthCertificateSeriesLetterCode;

    @JsonValue
    public int getBirthCertificateSeriesLetterCode() {
        return birthCertificateSeriesLetterCode;
    }

    BirthCertificateSeriesLetterEnum(int birthCertificateSeriesLetterCode){
        this.birthCertificateSeriesLetterCode = birthCertificateSeriesLetterCode;
    }

    public static List<BirthCertificateSeriesLetterEnum> getAllBirthCertificateSeriesLetters(){
        return new ArrayList<BirthCertificateSeriesLetterEnum>(Arrays.asList(BirthCertificateSeriesLetterEnum.values()));
    }

    public static BirthCertificateSeriesLetterEnum fromSeriesLetterString(String seriesLetterString) {
        if (seriesLetterString == null) {
            return null;
        }

        try {
            seriesLetterString = seriesLetterString.trim();
            int seriesLetterNumber = Integer.parseInt(seriesLetterString);

            switch (seriesLetterNumber) {
                case 1:
                    return BirthCertificateSeriesLetterEnum.Yek;
                case 2:
                    return BirthCertificateSeriesLetterEnum.Do;
                case 3:
                    return BirthCertificateSeriesLetterEnum.Seh;
                case 4:
                    return BirthCertificateSeriesLetterEnum.Chaahaar;
                case 9:
                    return BirthCertificateSeriesLetterEnum.Noh;
                case 10:
                    return BirthCertificateSeriesLetterEnum.Dah;
                case 11:
                    return BirthCertificateSeriesLetterEnum.Yaazdah;
                default:
                    return null;
            }
        } catch (NumberFormatException e) {
//            seriesLetterString = UtilityString.normalizeUnicodeString(seriesLetterString);
            return lettersMap.get(seriesLetterString);
        }
    }

    public boolean isSinglePart() {
        switch (this) {
            case Yek:
            case Do:
            case Seh:
            case Chaahaar:
            case Noh:
            case Dah:
            case Yaazdah:
            case Shin:
                return true;
            default:
                return false;
        }
    }

   /* public String getCivilRegistrationString(){
        return Utility.getLocalizedMessage(String.format("cr.series.letter.%s", toString()));
    }*/
}
