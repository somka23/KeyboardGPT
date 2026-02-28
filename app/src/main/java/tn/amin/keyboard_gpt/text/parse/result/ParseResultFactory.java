package tn.amin.keyboard_gpt.text.parse.result;

import java.util.List;

import tn.amin.keyboard_gpt.text.parse.PatternType;
import tn.amin.keyboard_gpt.text.transform.format.ConversionMethod;

public interface ParseResultFactory {
    static ParseResultFactory of(PatternType type) {
        switch (type) {
            case CommandAI:
                return new AIParseResultFactory();
            case Settings:
            default:
                return new SettingsParseResultFactory();
        }
    }

    ParseResult getParseResult(List<String> groups, int indexStart, int indexEnd);
}
