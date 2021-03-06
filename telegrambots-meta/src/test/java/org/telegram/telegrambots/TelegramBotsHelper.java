package org.telegram.telegrambots;

/**
 * @author Ruben Bermudez
 * @version 1.0
 * @brief TODO
 * @date 04 of November of 2016
 */
public final class TelegramBotsHelper {
    private TelegramBotsHelper() {
    }

    public static String GetUpdate() {
        return "{\"update_id\": 10000,\"message\": {\"date\": 1441645532,\"chat\": {\"last_name\": \"Test Lastname\",\"id\": 1111111,\"type\": \"private\",\"first_name\": \"Test Firstname\",\"username\": \"Testusername\"},\"message_id\": 1365,\"from\": {\"last_name\": \"Test Lastname\",\"id\": 1111111,\"first_name\": \"Test Firstname\",\"username\": \"Testusername\"},\"forward_from\": {\"last_name\": \"ForwardLastname\",\"id\": 222222,\"first_name\": \"ForwardFirstname\"},\"forward_date\": 1441645550,\"reply_to_message\": {\"date\": 1441645000,\"chat\": {\"last_name\": \"ReplyLastname\",\"type\": \"private\",\"id\": 1111112,\"first_name\": \"ReplyFirstname\",\"username\": \"Testusername\"},\"message_id\": 1334,\"text\": \"Original\"},\"text\": \"Bold and italics\",\"entities\": [{\"type\": \"italic\",\"offset\": 9,\"length\": 7},{\"type\": \"bold\",\"offset\": 0,\"length\": 4}],\"audio\": {\"file_id\": \"AwADBAADbXXXXXXXXXXXGBdhD2l6_XX\",\"duration\": 243,\"mime_type\": \"audio/mpeg\",\"file_size\": 3897500,\"title\": \"Testmusicfile\"},\"voice\": {\"file_id\": \"AwADBAADbXXXXXXXXXXXGBdhD2l6_XX\",\"duration\": 5,\"mime_type\": \"audio/ogg\",\"file_size\": 23000},\"document\": {\"file_id\": \"AwADBAADbXXXXXXXXXXXGBdhD2l6_XX\",\"file_name\": \"Testfile.pdf\",\"mime_type\": \"application/pdf\",\"file_size\": 536392}},\"edited_message\": {\"date\": 1441645532,\"chat\": {\"id\": -10000000000,\"type\": \"channel\",\"title\": \"Test channel\"},\"message_id\": 1365,\"from\": {\"last_name\": \"Test Lastname\",\"id\": 1111111,\"first_name\": \"Test Firstname\",\"username\": \"Testusername\"},\"text\": \"Edited text\",\"edit_date\": 1441646600},\"inline_query\": {\"id\": \"134567890097\",\"from\": {\"last_name\": \"Test Lastname\",\"type\": \"private\",\"id\": 1111111,\"first_name\": \"Test Firstname\",\"username\": \"Testusername\"},\"query\": \"inline query\",\"offset\": \"offset\",\"location\": {\"longitude\": 0.234242534,\"latitude\": 0.234242534}},\"chosen_inline_result\": {\"result_id\": \"12\",\"from\": {\"last_name\": \"Test Lastname\",\"type\": \"private\",\"id\": 1111111,\"first_name\": \"Test Firstname\",\"username\": \"Testusername\"},\"query\": \"inline query\",\"inline_message_id\": \"1234csdbsk4839\"},\"callback_query\": {\"id\": \"4382bfdwdsb323b2d9\",\"from\": {\"last_name\": \"Test Lastname\",\"type\": \"private\",\"id\": 1111111,\"first_name\": \"Test Firstname\",\"username\": \"Testusername\"},\"data\": \"Data from button callback\",\"inline_message_id\": \"1234csdbsk4839\"}\n}";
    }

    public static String GetResponseWithoutError() {
        return "{\"ok\": true,\"result\": [{\"update_id\": 10000,\"message\": {\"date\": 1441645532,\"chat\": {\"last_name\": \"Test Lastname\",\"id\": 1111111,\"type\": \"private\",\"first_name\": \"Test Firstname\",\"username\": \"Testusername\"},\"message_id\": 1365,\"from\": {\"last_name\": \"Test Lastname\",\"id\": 1111111,\"first_name\": \"Test Firstname\",\"username\": \"Testusername\"},\"forward_from\": {\"last_name\": \"ForwardLastname\",\"id\": 222222,\"first_name\": \"ForwardFirstname\"},\"forward_date\": 1441645550,\"reply_to_message\": {\"date\": 1441645000,\"chat\": {\"last_name\": \"ReplyLastname\",\"type\": \"private\",\"id\": 1111112,\"first_name\": \"ReplyFirstname\",\"username\": \"Testusername\"},\"message_id\": 1334,\"text\": \"Original\"},\"text\": \"Bold and italics\",\"entities\": [{\"type\": \"italic\",\"offset\": 9,\"length\": 7},{\"type\": \"bold\",\"offset\": 0,\"length\": 4}],\"audio\": {\"file_id\": \"AwADBAADbXXXXXXXXXXXGBdhD2l6_XX\",\"duration\": 243,\"mime_type\": \"audio/mpeg\",\"file_size\": 3897500,\"title\": \"Testmusicfile\"},\"voice\": {\"file_id\": \"AwADBAADbXXXXXXXXXXXGBdhD2l6_XX\",\"duration\": 5,\"mime_type\": \"audio/ogg\",\"file_size\": 23000},\"document\": {\"file_id\": \"AwADBAADbXXXXXXXXXXXGBdhD2l6_XX\",\"file_name\": \"Testfile.pdf\",\"mime_type\": \"application/pdf\",\"file_size\": 536392}},\"edited_message\": {\"date\": 1441645532,\"chat\": {\"id\": -10000000000,\"type\": \"channel\",\"title\": \"Test channel\"},\"message_id\": 1365,\"from\": {\"last_name\": \"Test Lastname\",\"id\": 1111111,\"first_name\": \"Test Firstname\",\"username\": \"Testusername\"},\"text\": \"Edited text\",\"edit_date\": 1441646600},\"inline_query\": {\"id\": \"134567890097\",\"from\": {\"last_name\": \"Test Lastname\",\"type\": \"private\",\"id\": 1111111,\"first_name\": \"Test Firstname\",\"username\": \"Testusername\"},\"query\": \"inline query\",\"offset\": \"offset\",\"location\": {\"longitude\": 0.234242534,\"latitude\": 0.234242534}},\"chosen_inline_result\": {\"result_id\": \"12\",\"from\": {\"last_name\": \"Test Lastname\",\"type\": \"private\",\"id\": 1111111,\"first_name\": \"Test Firstname\",\"username\": \"Testusername\"},\"query\": \"inline query\",\"inline_message_id\": \"1234csdbsk4839\"},\"callback_query\": {\"id\": \"4382bfdwdsb323b2d9\",\"from\": {\"last_name\": \"Test Lastname\",\"type\": \"private\",\"id\": 1111111,\"first_name\": \"Test Firstname\",\"username\": \"Testusername\"},\"data\": \"Data from button callback\",\"inline_message_id\": \"1234csdbsk4839\"}}]\n}";
    }

    public static String GetResponseWithError() {
        return "{\"ok\": false,\"error_code\": 400,\"description\": \"Error descriptions\",\"parameters\": {\"migrate_to_chat_id\": 12345,\"retry_after\": 12}}";
    }

    public static String GetSetGameScoreBooleanResponse() {
        return "{\"ok\": true,\"result\": true}";
    }

    public static String GetSetGameScoreMessageResponse() {
        return "{\"ok\": true,\"result\": {\"date\": 1441645532,\"chat\": {\"last_name\": \"Test Lastname\",\"id\": 1111111,\"type\": \"private\",\"first_name\": \"Test Firstname\",\"username\": \"Testusername\"},\"message_id\": 1365,\"from\": {\"last_name\": \"Test Lastname\",\"id\": 1111111,\"first_name\": \"Test Firstname\",\"username\": \"Testusername\"},\"text\": \"Original\"}}";
    }
}
