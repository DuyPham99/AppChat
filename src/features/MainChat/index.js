import { faArrowCircleUp } from "@fortawesome/free-solid-svg-icons";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { Container, Grid, Icon, IconButton, TextField, Typography } from "@mui/material";
import InputAdornment from '@mui/material/InputAdornment';
import { makeStyles } from "@mui/styles";
import ChatBox from "../ChatBox";

const useStyle = makeStyles({
    gridTitle: {
        height: "5vh"
    },
    gridChatBox: {
        height: "84vh"
    }
})

const MainChat = () => {
    const styles = useStyle()
    return (
        <Container>
            <Grid className={styles.gridTitle}>
                <Typography
                    align="center"
                    variant="h5"
                >
                    My Chats
                </Typography>
            </Grid>
            <Grid className={styles.gridChatBox}>
                <ChatBox></ChatBox>
            </Grid>
            <Grid>
                <TextField
                    variant="standard"
                    placeholder="Send a message..."
                    multiline
                    rows={1}
                    rowsMax={2}
                    fullWidth
                    InputProps={{
                        endAdornment: (
                            <InputAdornment>
                                <IconButton color="primary">
                                    <Icon color="primary">add_circle</Icon>
                                </IconButton>
                                <IconButton color="primary" sizeLarge edge="end">
                                    <FontAwesomeIcon icon={faArrowCircleUp} />
                                </IconButton>
                            </InputAdornment>
                        )
                    }}
                />
            </Grid>
        </Container>
    )
}

export default MainChat;