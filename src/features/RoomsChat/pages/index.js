import { Button, Container, Grid, Typography } from "@mui/material";
import RoomChat from "../../RoomChat";

const RoomsChat = () => {
    return (
        <Container>
            <Grid container>
                <Grid item xs={10}>
                    <Typography align="left" variant="h5">
                        My Chats
                    </Typography>
                </Grid>
                <Grid item xs={2}>
                    <Button variant="contained" size="small">+</Button>
                </Grid>
            </Grid>
            <Grid>
                <RoomChat title="Group1" latestMessage="heee"></RoomChat>
                <RoomChat title="Group2" latestMessage="sad"></RoomChat>
                <RoomChat title="Group2" latestMessage="sad"></RoomChat>
                <RoomChat title="Group2" latestMessage="sad"></RoomChat>
            </Grid>
            <Grid>
            </Grid>
        </Container>
    )
}

export default RoomsChat;