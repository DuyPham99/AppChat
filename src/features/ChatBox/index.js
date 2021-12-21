import { Grid, Stack } from "@mui/material";
import { makeStyles } from '@mui/styles';
import { useEffect, useState } from "react";
import UserMessage from "../UserMessage";

const useStyle = makeStyles({
})

const ChatBox = (pros) => {
    const styles = useStyle();
    const [messages, setMessages] = useState([]);

    useEffect(() => {
        let eventSource = new EventSource("http://localhost:8080/api/v1/chats/1/message/stream");
        eventSource.onmessage = e => {
            let val = JSON.parse(e.data);
            setMessages(messages => [...messages, val.content]);

        };
        return () => {
            eventSource.close();
            console.log("closed")
        }
    }, [])

    return (
        <Grid container>
            <Grid container xs={8}>
                <Stack spacing={1}>
                    {
                        messages.map(message => (
                            <UserMessage message={message}></UserMessage>
                        ))
                    }
                </Stack>
            </Grid>

            <Grid container xs={12}>
                <Grid xs={4}></Grid>
                <Grid xs={8} container justifyContent="flex-end">
                    <UserMessage message={messages}></UserMessage>
                </Grid>
            </Grid>
        </Grid>
    )
}

export default ChatBox;