import { Grid, Stack, Typography } from '@mui/material';
import { useStyles } from '../common/makeStyles';
import MediaOption from '../MediaOption';
import PeopleOption from '../PeopleOption';

const MenuOptions = (pros) => {
    const styles = useStyles();

    return (
        <>
            <Stack>
                <Grid className={styles.gridTitle} pt={2}>
                    <Typography
                        align="center"
                        variant="h6"
                    >
                        My Chats
                    </Typography></Grid>
                <Grid className={styles.gridChatBox}>
                    <PeopleOption></PeopleOption>
                    <MediaOption></MediaOption>
                </Grid>
            </Stack>
        </>
    )
}

export default MenuOptions;